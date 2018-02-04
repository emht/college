#! /bin/bash
#  set -x
 set -e

# Usage: ./input.sh -[best/avg/worst/all] [size] -[output to file or not]
# It will store the generated inputs in best.txt, average.txt and worst.txt
# This is the script to genrate the input for Best, Average and Worst Case Scenarious
# echo -n to prevent from going to new line

# Checking if the first argument is being passed or not
if [ -z "$1" ]; then
	echo "Please provide correct number of arguments"
	exit
fi

# Check if the user want to ouput to file or not
out2file=true
# if [ "$3" == "-no"]; then
# 	out2file = false

# Defining the size of the input you need to generated, default value is 100
if [ "$#" -ne 2 ]; then
	SIZE=100
else
	SIZE=$2
fi

# Clearing the files to remove redundancy in their respective functions
# Stream to file if out2file is set to 'true' by the user
# Best case Generation
function gen_best() {
	> best.txt
	
	for num in `seq 1 $SIZE`;
	do
		if [ out2file ]
		then
			echo -n "$num " >> best.txt
		else
			echo -n "$num "
		fi
	done
}

# Average case Generation by generating random number between 1 and 999
function gen_avg() {
	> average.txt

	COUNT=0
	while [ $COUNT -lt $SIZE ] ; do
		NUM=$(( ( $RANDOM % 999 ) + 1 ))
		if [ out2file ]
		then
			echo -n "$NUM " >> average.txt
		fi
		let COUNT=COUNT+1
	done
}

# Worst case Generation
function gen_worst() {
	> worst.txt
	
	NUM=$SIZE
	while [ $NUM -gt 0 ] ; do
		if [ out2file ] 
		then
			echo -n "$NUM " >> worst.txt
		else
			echo -n "$NUM "
		fi
		let NUM=NUM-1
	done
}

# Generates all the case scenarios input
function gen_all() {
	> best.txt
	> average.txt
	> worst.txt

	gen_best
	gen_avg
	gen_worst
}


#Checking for the type of input required
case $1 in
"-best" )
	gen_best ;;
"-avg" )
	gen_avg ;;
"-worst" )
	gen_worst ;;
"-all" )
	gen_all ;;
esac
