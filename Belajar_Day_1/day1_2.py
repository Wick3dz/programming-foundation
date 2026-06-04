# name = input("Enter your name: ")
# age = input("Enter your age: ")
# agebaru = int(input("Enter your age: "))

# print("Name:", name)
# print("Age:", age)
# print (agebaru + 1)

huruf = input("masukkan huruf: ").lower()
huruf_vokal = ['a','i','u','e','o']

if huruf in huruf_vokal :
    print(huruf, "huruf vokal")
else:
    print(huruf, "adalah konsonan")
