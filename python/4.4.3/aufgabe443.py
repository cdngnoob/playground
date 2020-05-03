from turtle import *
from random import randint

def ausgabe(newX, newY):
    x, y = pos()
    
    diffX = abs(newX - x)
    diffY = abs(newY - y)

    if (diffX <= 10 and diffY <= 10):
        randX = randint(1,200)
        randY = randint(1,200)
        goto(randX,randY)

#onscreenclick(ausgabe)
onclick(ausgabe)
mainloop()
