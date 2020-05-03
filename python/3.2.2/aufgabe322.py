def Anzahl_Vokale(Wort):
	vocale = ['a','e','i','o','u','ä','ü','ö']
	counter = 0
	
	for i in Wort:
		if i in vocale:
			counter += 1
	
	return counter 

def Viele_Vokale(Liste,Anzahl):
	result = []
	
	for i in Liste:
		if Anzahl_Vokale(i) >= Anzahl:
			result.append(i)
			
	return result

text = "Schreibe dann eine Funktion Viele_Vokale, die zwei Parameter hat."
liste = text.split()

output2 = Viele_Vokale(liste,4)
#print(output2)
