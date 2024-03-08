nomi = []
giudizi = []
sbagliato = True
somma = 0

for i in range(20):
    nome = input("Inserisci il nome dello studente: ")

    giudizio = input(f"Inserisci il giudizio dello studente {nome}: ")
    while (sbagliato):
        if (giudizio == "ottimo"):
            somma += 4
            sbagliato = False
        elif (giudizio == "distinto"):
            somma += 3
            sbagliato = False
        elif (giudizio == "buono"):
            somma += 2
            sbagliato = False
        elif (giudizio == "sufficiete"):
            somma += 1
            sbagliato = False
        else:
            giudizio = input(f"Giudizio non valido!\nReinserisci il giudizio dello studente {nome}: ")
    
    giudizi.append(giudizio)
    nomi.append(nome)

media = somma/20

print("La media della classe è di: ", media)