#buat attribute baru: existing loan (float)
#buat method baru: BDR (existing_loan/salary) * 100% -> return float
import sys
import csv
from Customer import Customer
from ReadCSV import ReadCSV
from RiskAssessor import RiskAssessor

def display_result(nama, decision):
    print(f"{nama} is {decision}")

def update_summary(summary, decision):
    summary[decision] += 1

def print_summary(summary):
    print("\nSummary:")
    print(summary)

if len(sys.argv) < 2:
    print(f'Usage: python {sys.argv[0]} <filename>')
    sys.exit()

filename = sys.argv[1]
reader1 = ReadCSV()
customer = reader1.bacaCSV(filename)

assessor = RiskAssessor()

summary = {
    "Eligible" : 0,
    "Not Eligible": 0,
    "Manual Review": 0
}

for customer1 in customer:
    decision = assessor.assess(customer1)
    display_result(customer1.name,decision)
    update_summary(summary, decision)

print_summary(summary)


