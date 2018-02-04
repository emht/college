'''
Takes the input from a file containing 'N' numbers
which outputs the 'N' and time to sort it via bubblesort.
'''
# imports for calculating the time take to execute the script
import time

def bubblesort(Arr):
    length = len(Arr)
    StartTime = time.time()
    for i in range(length):
        for j in range(0, length - i - 1):
            if (Arr[j] > Arr[j+1]):
                Arr[j], Arr[j+1] = Arr[j+1], Arr[j]
    
    TimeTaken = time.time() - StartTime
    # outputs the time taken in seconds
    print(float(round(TimeTaken, 5)))



if __name__ == "__main__" :
    Arr = input().split(' ')
    Arr.remove('')
    Arr = list(map(int, Arr))
    bubblesort(Arr)