from turtle import *

register_shape('ship',((0,10),(5,0),(15,0),(20,10)))
t = Turtle()
t.shape('ship')
t.color('blue')
t.left(90)
t.up()

for i in range(200):
	t.goto(0 - i,0)
