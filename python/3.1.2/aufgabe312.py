from turtle import *

def Weihnachtsbaum(x, y):
    up()
    goto(x,y)
    down()
    setheading(90)
    forward(40)
    left(90)
    forward(60)
    right(120)
    forward(120)
    right(120)
    forward(120)
    right(120)
    forward(60)
    
#Weihnachtsbaum(50, 100)

def Weihnachtswald():
	for i in range(-200,200,45):
		Weihnachtsbaum(i,0)
		
Weihnachtswald()		
