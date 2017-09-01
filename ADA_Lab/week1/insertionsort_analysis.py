'''
Takes the input from a file containing 'N' numbers
which outputs the 'N' and time to sort it via InsertionSort.
'''
# imports for calculating the time take to execute the script
import time

def InsertionSort(Arr):    
    length = len(Arr)
    StartTime = time.time()
    for i in range(1, length):
        tmp = Arr[i]
        k = i
        while k > 0 and tmp < Arr[k - 1]:
            Arr[k] = Arr[k - 1]
            k -= 1
        Arr[k] = tmp
    
    TimeTaken = time.time() - StartTime
    # outputs the time taken in seconds
    print(float(round(TimeTaken, 5)))




if __name__ == "__main__" :
    Arr = input().split(' ')
    Arr.remove('')
    Arr = list(map(int, Arr))
    InsertionSort(Arr)