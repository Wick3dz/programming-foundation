class Customer:
    def __init__(self, name , age, salary):
        self.name = name
        self.age = age
        self.salary = salary
    def show_summary(self):
        print("Customer:", self.name)
        print("Age:", self.age)
        print("Salary:", self.salary)

customer1 = Customer("Rina", 27, 900000)
customer1.show_summary()