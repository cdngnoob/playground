public abstract class Robot extends Machine {
/*	
 * zwingt die erbenden Klassen dazu diese Methode zu implementieren.
 */
	public abstract void move();
	
/*
 *   wäre die Methode move() nicht abstrakt, würden die erbenden Klassen nicht dazu gezwungen die Methode zu implementieren.
 *   In der Regel wird man die Methode abstract haben wollen. Ausnahmen wären z.B. um eine Art Default-Verhalten einzuführen.
 *   Alle Vögel können fliegen, nur Pinguine, Strausse, Kiwis und ein paar andere eben nicht.
 *   Das Default-Verhalten wird in der Klasse Vogel fesgelegt, 
 *   nur die flugunfähigen Vögel definieren ein neues Verhalten und überschreiben das Verhalten der Superklasse. 
 *   (In der Regel deutet das auf eine unsaubere Modellierung hin.) 
 */
//	public void move() {}
}