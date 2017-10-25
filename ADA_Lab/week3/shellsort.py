'''
Takes the input from a file containing 'N' numbers
which outputs the 'N' and time to sort it via shellsort.
'''
# imports for calculating the time take to execute the script
import time

def shellsort(arr):
	# Start with a big gap, then reduce the gap
	n = len(arr)
	gap = n/2

	# Do a gapped insertion sort for this gap size.
	# The first gap elements a[0..gap-1] are already in gapped 
	# order keep adding one more element until the entire array
	# is gap sorted
	while gap > 0:
		gap = int(gap)
		for i in range(gap,n):
			# add a[i] to the elements that have been gap sorted
			# save a[i] in temp and make a hole at position i
			temp = arr[i]
			
			# shift earlier gap-sorted elements up until the correct
			# location for a[i] is found
			j = i
			while  j >= gap and arr[j-gap] >temp:
				arr[j] = arr[j-gap]
				j -= gap

			# put temp (the original a[i]) in its correct location
			arr[j] = temp
		gap /= 2


if __name__ == "__main__" :
	Arr = input().split(' ')
	Arr.remove('')
	Arr = list(map(int, Arr))
	
	StartTime = time.time();
	shellsort(Arr);
	TimeTaken = time.time() - StartTime
	print(float(round(TimeTaken, 5)))
