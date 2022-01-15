# Write a Python program to append a new item to the end of the array. 
from array import *
n=int(input("Enter the size of array: "))
a=[]
for i in range(n):
   
    a.append(int(input()))
print(a)
app=int(input("Enter the element to be appended: "))
a.append(app)
print(a)
