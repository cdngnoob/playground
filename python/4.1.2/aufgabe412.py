try:
	firstNumber = input('Erste Zahl: ')
	firstNumber = int(firstNumber)
	
	kindOf = input('Rechenart: ')
	
	secondNumber = input('Zweite Zahl: ')
	secondNumber = int(secondNumber)
	
	if kindOf == '+':
		result = firstNumber + secondNumber
	elif kindOf == '-':
		result = firstNumber - secondNumber
	elif kindOf == '/':
		result = firstNumber / secondNumber
	elif kindOf == '*':
		result = firstNumber * secondNumber
	else:
		result = False
		print('Unbekannte Rechenart')

	if result != False:
		print('Das Ergebnis von',firstNumber,kindOf,secondNumber,'ist',result)

except ValueError:
	print('Falsche Eingabe!')
