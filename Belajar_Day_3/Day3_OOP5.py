#contoh inheritance py

# class Customer:
#     def __init__(self,name,age,salary):
#         self.name = name
#         self.age = age
#         self.salary = salary

# class premium_customer(Customer):
#     def __init__(self, name, age, salary,grade):
#         super().__init__(name, age, salary)
#         self.grade = grade

#dictionary
summary = {
    "Eligible" : 0, #key:value
    "Not eligible" : 0,
    "Manual review" : 0
}

summary["Eligible"] += 1
print(summary)