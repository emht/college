#! /bin/bash
# set -x
# set -e

# Usage: ./input.sh -[best/avg/worst] [size]
# It will store the generated inputs in best.txt, average.txt and worst.txt
# This is the script to genrate the input for Best, Average and Worst Case Scenarious

# Checking if the first argument is being passed or not
if [ -z "$1" ]; then
	echo "Please provide correct number of arguments"
	exit
fi

# Defining the size of the input you need to generated, default value is 10
if [ "$#" -ne 2 ]; then
	SIZE=10
else
	SIZE=$2
fi

# Clearing the files to remove redundancy
 > best.txt
 > average.txt
 > worst.txt

#Checking for the type of input required

best=false
avg=false
worst=false

if [ $1 = "-best" ]; then
	best=true
elif [ $1 = "-avg" ]; then
	avg=true
elif [ $1 = "-worst" ]; then 
	worst=true
else
	echo "Please provide proper arguments."
fi

#Best case Generation
function best {
	for num in `seq 1 $SIZE`;
	do
		echo $num >> best.txt
	done
}
