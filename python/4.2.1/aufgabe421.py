from random import randint

guess = False
randNumber = randint(1,20)

while not guess:
	try:
		number = int(input('Deine Zahl: '))
	except ValueError:
		print('Keine korrekte Eingabe!')
		continue
	
	if number > randNumber:
		print('Zu groß')
	elif number < randNumber:
		print('Zu klein')
	else:
		guess = True

print('Herzlichen Glückwunsch')
