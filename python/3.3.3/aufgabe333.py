def spiegeln(dicList):
	result = {}
	
	for i in dicList:
		result[dicList[i]] = i
	
	return result

Hauptstaedte = {
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

output = spiegeln(Hauptstaedte)
print(output)