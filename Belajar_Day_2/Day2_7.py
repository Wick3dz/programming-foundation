import csv
from CustomerHelperCSV import logic, input_cust, ask_continue, display_result,read_customers_from_csv

customers = read_customers_from_csv("data_karyawan.csv")
if len(customers) == 0:
    exit
for customer in customers:
    nama = customer["nama"]
    umur = int(customer["umur"])
    penghasilan = float(customer["gaji"])

    decision = logic(umur,penghasilan)
    display_result(nama, decision)