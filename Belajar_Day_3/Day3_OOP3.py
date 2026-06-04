#buat attribute baru: existing loan (float)
#buat method baru: BDR (existing_loan/salary) * 100% -> return float
class Customer:
    def __init__(self, name , age, salary,existing_loan):
        self.name = name
        self.age = age
        self.salary = salary
        self.existing_loan = existing_loan

    def show_summary(self):
        print("Customer:", self.name)
        print("Age:", self.age)
        print("Salary:", self.salary)
        print("Existing loan:", self.existing_loan)

    def hitung_dbr(self):
        dbr = (self.existing_loan/self.salary) * 100
        return dbr

customer1 = Customer("Rina", 27, 10000000, 3000000)
customer1.show_summary()
print("dbr:", customer1.hitung_dbr(), "%")