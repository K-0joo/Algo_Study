N=int(input())
arr=[]
arr.append(list(input().split(" ")))

number=[]

for _ in range(1001):
    number.append(1)

for i in range(2,1000):
    for j in range(2,500):
        if (i*j)>1000:
            break
        if number[i*j]==2:
            continue
        number[i*j]=2

count=0
number[1]=2

for i in range(N):
    temp=int(arr[0][i])
    if number[temp]==1:
        count+=1

print(count)



