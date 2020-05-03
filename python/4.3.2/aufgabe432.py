from turtle import *

register_shape('ship',((0,10),(5,0),(15,0),(20,10)))

t = Turtle()
t.shape('ship')
t.color('blue')
t.left(90)
t.up()
t.goto(-100,0)

p = Turtle()
p.shape('ship')
p.color('red')
p.left(90)
p.up()
p.goto(100,0)

for i in range(100):
	t.goto(-100 + i,0)
	p.goto(100 - i,0)

