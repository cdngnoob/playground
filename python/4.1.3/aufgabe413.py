from random import randint

status = True
dic = {
		'Sachsen':'Dresden',
		'Brandenburg':'Potsdam',
		'Bayern':'München',
		'Baden-Württemberg':'Stuttgart',
		'Berlin':'Berlin',
		'Bremen':'Bremen',
		'Hamburg':'Hamburg',
		'Hessen':'Wiesbaden',
		'Mecklenburg-Vorpommern':'Schwerin',
		'Niedersachsen':'Hannover',
		'Nordrhein-Westfalen':'Düsseldorf',
		'Rheinland-Pfalz':'Mainz',
		'Saarland':'Saarbrücken',
		'Sachsen-Anhalt':'Magdeburg',
		'Schleswig-Holstein':'Kiel',
		'Thüringen':'Erfurt'
}

foo = len(dic)

while (status):
	bar = randint(1,foo)
	c = 0
	
	for i in dic:
		c += 1
		if c == bar:
			bl = i
			hs = dic[i]
	
	quest = input('Wie lautet die Hauptstadt von ' + bl + '? ')
	
	if quest == 'Ende':
		print('Auf Wiedersehen')
		status = False
	elif quest == hs:
		print('Das ist richtig')
	elif quest != hs:
		print('Das ist leider falsch')

