from CustomerHelper import logic, input_cust, ask_continue,display_result

while True:
    try:
        nama, umur, penghasilan = input_cust()
        decision = logic(umur, penghasilan)
        display_result(nama, decision)
        if not ask_continue():
            break

    except ValueError:
        print('Input error')
    except Exception as e:
        print(e)
