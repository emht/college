'''
Takes the input from a file containing 'N' numbers
which outputs the 'N' and time to sort it via SelectionSort.
'''
# imports for calculating the time take to execute the script
import time

def selectionSort(Arr):
    length = len(Arr)
    StartTime = time.time()
    for i in range(length):
        least_index = i

        # find least index
        for k in range( i + 1 , len( Arr ) ):
            if Arr[k] < Arr[least_index]:
                least_index = k
        # Swap
        Arr[least_index], Arr[i] = Arr[i], Arr[least_index]
    
    TimeTaken = time.time() - StartTime
    # outputs the time taken in seconds
    print(float(round(TimeTaken, 5)))


if __name__ == "__main__" :
    Arr = input().split(' ')
    Arr.remove('')
    Arr = list(map(int, Arr))
    selectionSort(Arr)
    print ("Sorted array is:")