from turtle import *

register_shape('ship',((0,10),(5,0),(15,0),(20,10)))

t = Turtle()
t.shape('ship')
t.color('blue')

#for i in range(361):
#	t.forward(1)
#	t.setheading(i)

t = Turtle()
t.shape('ship')
t.color('blue')

for i in range(0,360,18):
	t.forward(20)
	t.left(18)
