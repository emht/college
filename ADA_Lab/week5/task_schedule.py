def jobSequencing(p,d):
	n=len(p)
	res=[0]
	deadline=1
	for i in range(1,n):
		if d[i] >= deadline +1:
			res.append(i)
			deadline +=1
	print(res)

p=[20, 10, 40, 30]
d=[1,5,2,1]
jobSequencing(p,d)