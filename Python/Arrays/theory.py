# OPERATIONS
# Traverse − print all the array elements one by one.

# Insertion − Adds an element at the given index.

# Deletion − Deletes an element at the given index.

# Search − Searches an element using the given index or by the value.

# Update − Updates an element at the given index.


# declaration
# from array import *
# arrayName = array(typecode, [Initializers])
# typecodes
# b	Represents signed integer of size 1 byte
# B	Represents unsigned integer of size 1 byte
# c	Represents character of size 1 byte
# i	Represents signed integer of size 2 bytes
# I	Represents unsigned integer of size 2 bytes
# f	Represents floating point of size 4 bytes
# d	Represents floating point of size 8 
# eg:
from array import *
from lib2to3.pgen2.token import RPAR
a=array('i',[1,2,3,4,5,6])
for i in a:
    print(i)

# accessing array elements
x=array('i',[1,2,3,4,5,6])
print(x[2])
#  insert() function in python 
x.insert(1,7)
print(x)
# this inserts a new element at the passed index and pushes the existing elments to right

# remove() function
x.remove(7)
print(x)
# removes 7 

# UPDATE operation
x[1]=9
print(x)

# SEARCH operation
print(x.index(9))
# this prints 1