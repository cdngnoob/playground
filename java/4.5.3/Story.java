public class Story {

	public static void main(String[] args) {
		Parrot paco = new Parrot();
		Robot robin = new Robot();
		SuperVillain eikeVil = new SuperVillain();
		paco.fly();
		eikeVil.fly();
		eikeVil.tryToCatch(false);
		robin.fly();
		robin.tryToCatch(true);
	}
}
