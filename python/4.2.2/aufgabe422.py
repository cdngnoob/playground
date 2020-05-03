from random import randint

guess = False
randNumber = randint(1,100)

while not guess:
	try:
		number = int(input('Deine Zahl: '))
	except ValueError:
		print('Keine korrekte Eingabe!')
		continue
	
	if (number - 20) > randNumber:
		print('Viel zu groß')
	elif number + 20 < randNumber:
		print('Viel zu klein')
	elif number > randNumber:
		print('Zu groß')
	elif number < randNumber:
		print('Zu klein')
	else:
		guess = True

print('Herzlichen Glückwunsch')

