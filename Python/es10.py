def CaricamentoReparti():
    repNome = []
    repIncasso = []
    somma = 0

    for i in range(reparti):
        nome = input("Inserisci il nome del reparto: ")
        repNome.append(nome)

        x = float(input("Inserisci l'incasso giornaliero del reparto: "))
        repIncasso.append(x)
        somma += x

    return somma


reparti = int(input("Inserisci quanti reparti: "))
while reparti < 2 and reparti > 10:
    reparti = int(input("Valore non valido!\nInserisci quanti reparti: "))


media = CaricamentoReparti()/reparti
print ("La media è ",media)