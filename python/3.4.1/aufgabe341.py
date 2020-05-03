from random import randint

zähler = {}

def zähle(wurf):
	if wurf in zähler:
		zähler[wurf] = zähler[wurf] + 1
	else:
		zähler[wurf] = 1

def würfeln(anzahl):
	for i in range(anzahl):
		zähle(randint(1,6))

#würfeln(10)

#print(zähler)
