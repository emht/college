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

#Best case Generation
function gen_best() {
	for num in `seq 1 $SIZE`;
	do
		echo $num >> best.txt
	done
}

# Average case Generation
function gen_avg() {
	COUNT=0
	while [ $COUNT -lt $SIZE ] ; do
		NUM=$(( ( $RANDOM % 999 ) + 1 ))
		echo $NUM >> average.txt
		let COUNT=COUNT+1
	done
}

# Worst case Generation
function gen_worst() {
	NUM=$SIZE
	while [ $NUM -gt 0 ] ; do
		echo $NUM >> worst.txt
		let NUM=NUM-1
	done

}


#Checking for the type of input required
case $1 in
"-best" )
	gen_best ;;
"-avg" )
	gen_avg ;;
"-worst" )
	gen_worst ;;
esac

