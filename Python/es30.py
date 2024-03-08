lunghezza = int(input("Inserisci la lunghezza del numero binario: "))
nBase10 = 0

for i in range(lunghezza):
    n = int(input(f"Inserisci la {i+1}° cifra partendo da destra: "))
    while (n != 0 and n != 1):
        n = int(input(f"Valore non valido!\nReinserisci la {i+1}° cifra partendo da destra: "))
    
    nBase10 += (2**i)*n

print("il numero binario che hai inserito in base decimale è ", nBase10)