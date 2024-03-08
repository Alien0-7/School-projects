def appartenenza(m,q,xp,yp):
    if (yp == xp*m+q):
        print("Il punto non appartiene alla retta")
    else: 
        print("Il punto non appartiene alla retta")

x = float(input("Inserisci la x del punto: "))
y = float(input("Inserisci la y del punto: "))
m = float(input("Inserisci il coefficente: "))
q = float(input("Inserisci l'intercetta: "))
appartenenza(m,q,x,y)