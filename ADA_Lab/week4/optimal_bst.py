import sys
def optimalSearchTree(keys, freq):
    #Create an auxiliary 2D matrix to store results of subproblems
    n = len(keys)
    cost = [[0 for x in range(n)] for y in range(n)]
    storeRoot = [[0 for i in range(n)] for i in range(n)]

    #For a single key, cost is equal to frequency of the key
    for i in range (0,n):
        cost[i][i] = freq[i]

    # Now we need to consider chains of length 2, 3, ... .
    # L is chain length.
    for L in range (2,n+1):
        for i in range(0,n-L+1):
            j = i + L - 1
        cost[i][j] = sys.maxsize
        for r in range (i,j+1):
            c = (cost[i][r-1] if r >i else 0)
            c += (cost[r+1][j] if r < j else 0)
            c += sum(freq[i:j+1])
            if (c < cost[i][j]):
                cost[i][j] = c
                storeRoot[i][j] = r
    return cost[0][n-1]

if __name__ == "__main__" :
    print("Enter the inputs - ")
    num =  input()
    num_array = list()
    freq_array = list()

    for i in range(int(num)):
        n = input("num :")
    num_array.append(int(n))
    for i in range(int(num)):
        n = input("freq :")
    freq_array.append(int(n))

    print("optimal cost is: ", optimalSearchTree(num_array,freq_array))