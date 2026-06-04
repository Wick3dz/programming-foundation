def logic (umur, penghasilan) :
    MIN_AGE = 21
    MIN_SALARY = 3000000
    MIN_APPROVE = 8000000

    if umur >= MIN_AGE and penghasilan >= MIN_APPROVE:
        decision = "Eligible"
    elif umur >= MIN_AGE and penghasilan >= MIN_SALARY:
        decision = "Needs Manual Review"
    else :
        decision = "Not Eligible"

    #print(f"{nama} is {decision}")
    
    return decision

def display_result(nama, decision):
    print(f"{nama} is {decision}")

    
def input_cust ():
        nama = input('Masukkan nama: ')
        if not nama.replace(" ","").isalpha():
            raise Exception("Name must contain Letters Only")
        umur = int(input('Masukkan umur: '))
        penghasilan = float(input('Masukkan gaji: '))

        return nama, umur, penghasilan
        
def ask_continue ():
        lanjut = input("Apakah lanjut? (y/n): ").lower()
        if lanjut in ['y']: # contoh klo lower
            return True
        elif lanjut == 'n' or lanjut =='N': # contoh if biasa
            return False
        else :
            print("input tidak sesuai")
            return False    