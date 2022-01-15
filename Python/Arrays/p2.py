# stock price of apples for 5 days are stored in an array print the price of apple in day 1 and day 3
from array import *
a=[]
for i in range(5):
    x=int(input("Enter the price: "))
    a.append(x)
print("day 1 price: ",a[0])
print("day 3 price: ",a[2])