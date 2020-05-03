def Wörter_mit_a(liste):
	ergebnis = []
	for i in liste:
		if i[0] == 'a':
			ergebnis.append(i)
			
	return ergebnis

text = "nach adams ist die antwort 42"
liste = text.split()
output = Wörter_mit_a(liste)
#print(output)
