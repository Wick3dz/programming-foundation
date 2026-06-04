# #buka file
# file = open("test.txt","r")

# #baca isi file
# content = file.read()

# #tampilkan isi file
# print(content)

# #tutup file
# file.close()

#cara yang lebih singkat
with open("test.txt", "r") as file:
    content = file.read()
    print(content)

#buat file
with open ("test2.txt", "w") as file:
    file.write("Halo, apa kabar?\n")
    file.write("Test 123\n")
print("File berhasil dibuat")

#append file / menambahkan
with open ("test2.txt", "a") as file:
    file.write("Halo, apa kabar??\n")
    file.write("Test 1234\n")
print("File berhasil dibuat")