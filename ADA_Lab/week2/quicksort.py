import time

def partition(Arr, low, high):
	pivot = Arr[high]
	small_index = low - 1
	for j in range(low, high):
		if Arr[j] < pivot:
			small_index += 1;
			Arr[small_index], Arr[j] = Arr[j], Arr[small_index]
	
	Arr[small_index + 1], Arr[high] = Arr[high], Arr[small_index + 1]
	return (small_index + 1)

def quicksort(Arr, low, high):
	if low < high:
		pi = partition(Arr, low, high);

		quicksort(Arr, low, pi - 1);
		quicksort(Arr, pi + 1, high);

if __name__ == '__main__':
	Arr = input().split(' ')
	Arr.remove('')
	Arr = list(map(int, Arr));
	low, high = 0, len(Arr) - 1

	StartTime = time.time();
	quicksort(Arr, low, high);
	TotalTime = time.time() - StartTime
	print(Arr)
	print(TotalTime)
