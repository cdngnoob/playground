from random import randint

def weather():
	weekDays = ['Montag','Dienstag','Mittwoch','Donnerstag','Freitag','Sonnabend','Sonntag']
	startTemp = randint(10,20)
	
	for i in weekDays:
		if i == "Montag":
			output = "Am " + i + " werden es " + str(startTemp) + " Grad"
			print(output)
			tempTemp = startTemp
		else:
			boolFoo = randint(0,1)
			
			if boolFoo == 0:
				tempTemp -= 2
			else:
				tempTemp += 2
				
			output = "Am " + i + " werden es " + str(tempTemp) + " Grad"
			print(output)
	
weather()
