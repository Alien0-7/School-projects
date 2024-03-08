def cifratore():
    testoCifrato=""
    testoChiaro = input("Inserisci il testo da cifrare: ")
    passo = int(input("Inserisci il passo compreso tra 3 a 10: "))
    while passo > 10 or passo < 3:
        passo = int(input("Valore non valido!\nReinserisci il valore: "))

    for i in testoChiaro:
        char = ord(i) + passo
        if (i.isupper() and char > 90):
            testoCifrato += chr(char-26)
        elif (i.islower() and char > 122):
            testoCifrato += chr(char-26)
        elif (i.isalpha()):
            testoCifrato += chr(char)
        else:
            testoCifrato += i

    print ("Il testo cifrato è:",testoCifrato)




def decifratore():
    testoCifrato= input("Inserisci il testo da decifrare: ")
    testoChiaro = ""
    passo = int(input("Inserisci il passo: "))

    for i in testoCifrato:
        char = ord(i) - passo
        if (i.isupper() and char < 65):
            testoChiaro += chr(char+26)
        elif (i.islower() and char < 97):
            testoChiaro += chr(char+26)
        elif (i.isalpha()):
            testoChiaro += chr(char)
        else:
            testoChiaro += i

    print ("Il testo decifrato è:",testoChiaro)





nonCorretto = True

while nonCorretto:
    scelta = input("Inserisci se vuoi cifrare o decifrare un testo: ")

    if (scelta == "decifrare"):
        nonCorretto = False
        decifratore()
    elif (scelta == "cifrare" ):
        nonCorretto = False
        cifratore()
    else:
        print("Valore non valido!")