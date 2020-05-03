from turtle import *
from random import randint

def wildTurtleRide():
	linien = randint(10,40)
		
	for i in range(linien):
		laenge = randint(10,100)
		angle = randint(10,170)
		
		forward(laenge)
		setheading(angle)
	
wildTurtleRide()
