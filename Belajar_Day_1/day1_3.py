nama = input('Masukkan nama: ')
umur = int(input('Masukkan umur: '))
penghasilan = float(input('Masukkan gaji: '))
MIN_AGE = 21
MIN_SALARY = 3000000

if umur >= MIN_AGE and penghasilan >= MIN_SALARY:
    print(nama, "is Eligible")
else :
    print(nama, 'is Not Eligible')
