def printMaxActivities(s, f):
    n = len(f)
    print("The following activities are selected: ")
    i = 0
    print(i),
    for j in range(n):
        if s[j] >= f[i]:
            print (j),
        i = j

n = int(input("enter number of tasks: "))
s = list()
f = list()
for i in range(int(n)):
    v = input("enter starting times: ")
s.append(int(v))
for i in range(int(n)):
    w = input("enter ending times: ")
f.append(int(w))
printMaxActivities(s, f)