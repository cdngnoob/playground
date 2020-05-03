def Stadtstaaten():
	Hauptstädte = {
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
	
	result = []
	
	for i in Hauptstädte:
		if i == Hauptstädte[i]:
			result.append(i)
		
	return result
	
output = Stadtstaaten()
print(output)
