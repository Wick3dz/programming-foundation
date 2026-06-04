class Customer:
    def __init__(self, name , age, salary,existing_loan):
        self.name = name
        self.age = age
        self.salary = salary
        self.existing_loan = existing_loan

    # def show_summary(self):
    #     print("Customer:", self.name)
    #     print("Age:", self.age)
    #     print("Salary:", self.salary)
    #     print("Existing loan:", self.existing_loan)

    def hitung_dbr(self):
        dbr = (self.existing_loan/self.salary) * 100
        return dbr