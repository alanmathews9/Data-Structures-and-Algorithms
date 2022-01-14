n=int(input("Enter the value: "))
for i in range(n+1):
    if i%3==0 and i%5!=0:
        print("Fizz")
    elif i%3!=0 and i%5==0:
        print("Buzz")
    elif i%5==0 and i%3==0:
        print("FizzBuzz")
