'''
Takes the input from a file containing 'N' numbers
which outputs the 'N' and time to sort it via radixsort.
'''
# imports for calculating the time take to execute the script
import time

def radixsort(arr):
	RADIX = 10
	maxLength = False
	tmp, placement = -1, 1

	while not maxLength:
		maxLength = True
		# declare and initialize buckets
		buckets = [list() for _ in range(RADIX)]
		#split arr between lists
		for i in arr:
			tmp = int(i / placement)
			buckets[tmp % RADIX].append(i)
			if maxLength and tmp > 0:
				maxLength = False
		# empty lists into arr array
		a = 0
		for b in range( RADIX ):
			buck = buckets[b]
			for i in buck:
				arr[a] = i
		# move to next digit
		placement *= RADIX	


if __name__ == "__main__" :
	Arr = input().split(' ')
	Arr.remove('')
	Arr = list(map(int, Arr))
	
	StartTime = time.time();
	radixsort(Arr);
	TimeTaken = time.time() - StartTime
	print(float(round(TimeTaken, 5)))
