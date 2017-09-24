'''
Takes the input from a file containing 'N' numbers
which outputs the 'N' and time to sort it via mergesort.
'''
# imports for calculating the time take to execute the script
import time

def merge(Arr, left, mid, right):
	left_arr_size = mid - left + 1
	right_arr_size = right - mid
	
	left_Arr = [Arr[left + i] for i in range(0, left_arr_size)]
	right_Arr = [Arr[mid + 1  + j] for j in range(0, right_arr_size)]
	
	# Merge the temp arrays babck into Arr
	i, j, k = 0, 0, left
	while i < left_arr_size and j < right_arr_size :
		if left_Arr[i] <= right_Arr[j] :
			Arr[k] = left_Arr[i];
			i += 1
		else :
			Arr[k] = right_Arr[j]
			j += 1;
		k += 1

	# Copy the remaining elements of L[], if there are any
	while i < left_arr_size :
		Arr[k] = left_Arr[i]
		i += 1
		k += 1
	# Copy the remaining elements of right_Arr, if there are any
	while j < right_arr_size:
		Arr[k] = right_Arr[j]
		j += 1;
		k += 1;

def mergesort(Arr, left, right):
	if (left < right) :
		mid = int((left + (right - 1)) / 2);
		
		# Sort first and second halves recursively and then merge them
		mergesort(Arr, left, mid);
		mergesort(Arr, mid + 1, right);
		merge(Arr, left, mid, right);
    

if __name__ == "__main__" :
	Arr = input().split(' ')
	Arr.remove('')
	Arr = list(map(int, Arr))
	length = len(Arr)
	left, right = 0, length - 1;
	
	StartTime = time.time();
	mergesort(Arr, left, right);
	TimeTaken = time.time() - StartTime
	print(float(round(TimeTaken, 5)))
	print(Arr)
