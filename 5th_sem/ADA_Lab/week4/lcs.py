# imports for calculating the time take to execute the script
import time

def lcs(X , Y):
    '''
    Takes the input from the user, X and Y
    which outputs the longest common subsequences.
    '''    
    m = len(X)
    n = len(Y)
 
    
    L = [[None]*(n+1) for i in range(m+1)]
 
    
    for i in range(m+1):
        for j in range(n+1):
            if i == 0 or j == 0 :
                L[i][j] = 0
            elif X[i-1] == Y[j-1]:
                L[i][j] = L[i-1][j-1]+1
            else:
                L[i][j] = max(L[i-1][j] , L[i][j-1])
 


    return L[m][n]

if __name__ == "__main__":
    X = "ABCGLPD"
    Y = "ADCE"
    StartTime = time.time();
    print("Length of lcs for X and Y is ", lcs(X, Y))
    TimeTaken = time.time() - StartTime
    print("Time Taken: " + str(float(round(TimeTaken, 5))))

