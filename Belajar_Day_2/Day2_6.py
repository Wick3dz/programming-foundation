import csv
from CustomerHelper import logic, input_cust, ask_continue,display_result


def baca_csv(nama_file):
    customers = []
    try:
        with open(nama_file, mode='r') as file:
            reader = csv.DictReader(file)  # baca sebagai dictionary
            
            for row in reader:
                nama = row["nama"]
                umur = int(row["umur"])
                penghasilan = float(row["gaji"])

                decision = logic(umur, penghasilan)
                display_result(nama,decision)
                
    except FileNotFoundError:
        print("File not found:", nama_file)
            
baca_csv("data_karyawan.csv")

