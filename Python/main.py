# variables in python

from ast import If
from multiprocessing import cpu_count
from operator import truediv
from socket import if_indextoname


n=1000
rating=49.9999
isit=False
course_name="Python"
course_name1="""
multiple
lines
"""
x,y=1,2
x=y=1
print(type(isit))
print(type(course_name))
print(type(course_name1))


# variable changing value and type
age=20
age="hello"  

# mutable and immutable

a=1
print(id(a))
# this will print the addresss of a.
a=a+1 
print(id(a))
# here new memory location will allocated and hence prints a different address value this is how immutable type works

# lists/arrays
z=[1,2,3]
print(id(z))
z.append(4)
print(id(z))
# prints the same address and hence lists are mutable

# STRINGS
course="python programming world"
print(len(course))
# this prints the length of string
print(course[0])
# gives 'p'
print(course[-1])
# gives 'd'
print(course[0:3])
# prints 0 to 3 indices but excludes 3 rd index and includes 0th index
print(course[:3])
# puts 0 at the beginning
print(course[0:])
# upto last element
print(course[:])
# prints the entire string
print(id(course))
print(id(course[0]))
print(id(course[1]))
# prints different values


# ESCAPE SEQUENCES
# escape characters
message="python \" programming"
print(message)
#  \" is used to display " in between so that it will not conflict with the initial double quotes
message2="""
python 
programming
"""
print(message2)

# FORMATTED STRINGS
first= "Achyuth"
last ="Mohan"
final=first+" "+last
print(final)
# prints Achyuth Mohan
first ="Mosh"
last="Hamedani"
full=f"{first} {last}"
print(full)
# prints Mosh Hamedani
course=" python programmimg"
print(course.upper())
print(course.lower())
# prints in lower and upper
print(course.strip())
# prints the string by removing the initial white space
print(course.find("pro"))
# to find the index of a character or sub-string
print(course.replace("p","s"))
# this replaces all "p" s with "s" sython srogrammimg
print("Achyuth" in course)
# prints false since its absent

# NUMBERS
x=10
print(x)
# prints 10
x=0b10
print(x)
# prints 2 since binary
x=2
print(bin(x))
# prints the binary of 2
x=0x12c
print(x)
# gives 300

x=3+ 2j
# complex number 3+ 2i

# ARITHMETIC OPERATORS(+,-,%,/,*,**)
# WORKING WITH NUMBERS
PI=3.14
print(PI)
# this is constant and should not  be modified and here we dont have const unlike c
print(round(PI))
# gives 3
print(abs(PI))

# gives 3.14 also removes negative sign if its negative number
# google python 3 built in functions
import math
print(math.floor(PI))
# this prints 3
# search python 3 math module

# type conversions
# x=input("x: ")
# x=int(x)
# y=x+1
# print(y)
# when we simply input then it will accept as a string
# implicit type conversion functions

# int()
# float()
# bool()
# str()

# CONDITIONALS
age=22
if age>=18:
    print("aged")
elif age>=13:
    print("teenager")
else:
    print("minor")

# LOGICAL OPERATORS
# AND ,OR ,NOT
name="Mosh"
if not name:
    print("Name is empty")
else:
    print("non empty")
# since ""is false equivalent
age=22
if age>=18 and age<65:
    print("Eligible")
# OR
if 18<=age<65:
    print("Eligible")

# TERNARY OPERATOR
message="eligible" if age>=18 else "Not eligible"
print(message)
# FOR LOOPS
# for x in "python":
#     print(x)
# for x in ['a','a','b','c']:
#     print(x)
for x in range(5):
    print(x)
# prints 0-4
for x in range(0,10,2):
    print(x)
# this prints all even numbers since it produces an AP with d=2
# range is basically a class 
# FOR..ELSE
names=["Johns","Mary"]
flag=False
for name in names:
    if name.startswith("K"):
        print("Found")
        flag=True
        break
else:
        print("Not found")

# WHILE LOOPS
# guess=0
# answer=5
# while answer!=guess:
#     guess=int(input("Guess: "))
# else: 
#     pass
# FUNCTIONS
def increment(number,by):
    return (number,number+by)
(a,b)=increment(2,3)
print(a)
print(b)
# print(increment(2,3)) this prints(2,5)


