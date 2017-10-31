def binomialCoefficient(n, k):
    # since C(n, k) = C(n, n - k)
    if (k > n - k):
        k = n - k
    # initialize result
    result = 1;
    # Calculate value of
    # [n * (n-1) *---* (n-k + 1)] / [k * (k-1) *----* 1]
    for i in range(k):
        result = result * (n - i)
        result = result / (i + 1)
    return result

if __name__ == "__main__":
    # Driver program to test above function
    n = int(input("value of N:"))
    k = int(input("value of k:"))
    res = binomialCoefficient(n, k)
    print("Value of C(%d, %d) is %d" % (n, k, res))