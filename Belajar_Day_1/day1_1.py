# #dynamically typed
# name = "Budi"
# age = 20
# MIN_AGE = 21

# print('Name: ', name)
# print('Age: ', age)
# print('Min eligible age: ', MIN_AGE)

# a = 10
# b = 3

# print (a+b)
# print (a-b)
# print (a*b)
# print (a/b)

age = 22;
# salary = 400000
MIN_AGE = 21
# MIN_SALARY = 300000

# print (age >= MIN_AGE)
# print (salary >= MIN_SALARY)
# print (age >= MIN_AGE and salary >= MIN_SALARY)

if age >= MIN_AGE:
    print("Eligible by age")
else:
    print("Not eligible by age")

# if one liner
print('ELIGIBLE BY AGE') if age >= MIN_AGE else print ('NOT ELIGIBLE')
