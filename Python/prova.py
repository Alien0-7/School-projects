import turtle
import math
turtle.right(180)
def casa(lato):
    for i in range(4):
        turtle.forward(lato)
        turtle.right(90)
    turtle.penup()
    turtle.forward(lato)
    turtle.right(90)
    turtle.forward(lato)
    turtle.right(45)
    turtle.pendown()
    turtle.forward(lato * math.sqrt(2)/2)
    turtle.right(90)
    turtle.forward(lato * math.sqrt(2)/2)
    return lato * math.sqrt(2)/2


case = int(input("Inserisci quante case vuoi far visualizzare: "))
lato = int(input("Inserisci il numero della grandezza della prima casa: "))

for i in range(case):
    lato = casa(lato)
    turtle.left(180)



turtle.done()