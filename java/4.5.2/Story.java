public class Story {

	public static void main(String[] args) {
		TheChase theChase = new TheChase();
		Parrot paco = new Parrot();		
		Robot ronja = new Robot();		
		SuperVillain eikeVil = new SuperVillain();
        
        theChase.chasers.add(paco);
        theChase.chasers.add(ronja);
        theChase.chasers.add(eikeVil);
        
        theChase.chase();
	}

}
