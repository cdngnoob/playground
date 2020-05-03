start = 50
state = False
minNum = 0
maxNum = 100

while not state:
	foo = input(start)

	try:
		if foo == 'r':
			state = True
		elif foo == 'g':
			maxNum = start
			diff = (start - minNum) * 0.5
			start = int(start - diff)
			continue
		elif foo == 'k':
			minNum = start
			diff = (maxNum - start) * 0.5
			start = int(start + diff)
			continue
	except ValueError:
		print('Falsche Eingabe!')

