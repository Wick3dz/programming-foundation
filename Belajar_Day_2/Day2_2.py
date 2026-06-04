while True :
    MIN_AGE = 21
    MIN_SALARY = 3000000
    MIN_APPROVE = 8000000

    try: 
        nama = input('Masukkan nama: ')
        if not nama.replace(" ","").isalpha():
            raise Exception("Name must contain Letters Only")
        umur = int(input('Masukkan umur: '))
        penghasilan = float(input('Masukkan gaji: '))
    except ValueError:
        print('Input error')
        continue
    except Exception as e:
        print(e)
        continue
        
    if umur >= MIN_AGE and penghasilan >= MIN_APPROVE:
        decision = "Eligible"
    elif umur >= MIN_AGE and penghasilan >= MIN_SALARY:
        decision = "Needs Manual Review"
    else :
        decision = "Not Eligible"
    print(f"{nama} is {decision}")

    lanjut = input("Apakah lanjut? (y/n): ").lower()
    if lanjut in ['y']: # contoh klo lower
        continue
    elif lanjut == 'n' or lanjut =='N': # contoh if biasa
        break
    else :
        print("input tidak sesuai")
        break