import csv
from Customer import Customer
class ReadCSV:
    def bacaCSV (self, filename):
        customers = []
        try:
            with open(filename, "r") as file:
                reader = csv.DictReader(file)

                for row in reader:
                    name = row["nama"]
                    age = int(row["umur"])
                    salary = float(row["gaji"])
                    existing_loan = float(row["existing_loan"])

                    cust = Customer(name, age, salary, existing_loan)
                    customers.append(cust)


        except FileNotFoundError:
            print("File not found:", filename)

        return customers