import sys

from CustomerHelperCSVnew import logic, input_cust, ask_continue, display_result,read_customers_from_csv

if len(sys.argv) < 2:
    print(f'Usage: python {sys.argv[0]} <filename>')
else:
    filename = sys.argv[1]
    customers = read_customers_from_csv(filename)

    if len (customers) == 0:
        exit

    for customer in customers:
        name = customer["nama"]
        age = int(customer["umur"])
        salary = float(customer["gaji"])

        decision = logic(age, salary)
        display_result(name, decision)

        #CARA MANGGIL: py Day3_1.py ..\data_karyawan.csv