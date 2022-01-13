# variables in python

from multiprocessing import cpu_count


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


