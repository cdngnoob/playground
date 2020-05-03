public class Story {
	
	/* Folge den Anweisungen in den Tests und notiere deine Beobachtungen. 
	 * Setze den Code nach jedem der Tests in den Ausgangszustand zurück. 
	 * 
	 * Test 1.: Führe den Code aus wie er ist und sieh dir die Ergebnisse an.
	 * Test 2.: Entferne die Methode move() aus einer der Klassen GoodRobot oder EvilRobot und versuche das Programm zu starten.
	 * Test 3.: Entferne die Methode move() aus der Klasse Robot.  
	 * Test 4.: In der Klasse Robot ist eine zweite move() Methode gelistet aber auskommentiert. 
	 *          Ersetze die abstrakte move() Methode, durch die andere move() Methode. 
	 *          Wiederhole dann Test2.    
	 * Test 5.: Entferne die Kommentare vor robinMachine.move() und ronjaMachine.move()       
	 * Test 6.: Ändere den Typ von robinRobot von Robot zu GoodRobot.   
	 *          
	 * Was geschieht? Diskutiert eure Beobachtungen unter
	 * https://open.hpi.de/courses/javaeinstieg2017/question/8bbce7ad-620d-46f3-b711-b03214eac799
	 * 
	 * Weitere interessante Fragen:
	 *  - Diskutiert Gründe warum man immer den allgemeinst möglichen Datentypen benutzen sollte.
	 *  - Diskutiert Gründe warum man vermeiden sollte Object als Datentyp zu benutzen.
	 */

	
	
	
	public static void main(String[] args) {
		
		System.out.println("The Machines");
		Machine robinMachine = new GoodRobot();
//		robinMachine.move();
		robinMachine.act();
//		
		Machine ronjaMachine = new EvilRobot();
//		ronjaMachine.move();
		ronjaMachine.act();
		
        System.out.print("\n\n");
        System.out.println("The Robots");
		Robot robinRobot = new GoodRobot();
//		GoodRobot robinRobot = new GoodRobot();
		robinRobot.move();
		robinRobot.act();
		
		Robot ronjaRobot = new EvilRobot();
		ronjaRobot.move();
		ronjaRobot.act();
	}
}
