applicants = [
    "Rina",
    "Budi",
    "Andi",
    "Sari"
]

existing_loans = [
    "Budi",
    "Sari"
]

def cekStatus():
    for person in applicants:
        if person in existing_loans:
            print(person, "Manual Review")
        else:
            print(person, "Normal")

cekStatus();