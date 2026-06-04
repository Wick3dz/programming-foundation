while True :
    lanjut = input("Apakah lanjut? (y/n): ").lower()
    if lanjut in ['y']: # contoh klo lower
        print("Halo")
        continue
    elif lanjut == 'n' or lanjut =='N': # contoh if biasa
        break
    else :
        print("input tidak sesuai")
        break
