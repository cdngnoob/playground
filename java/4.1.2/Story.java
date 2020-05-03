public class Story {

	public static void main(String[] args) {
		Robot ronja = new Robot("Ronja", 5, 3.5);
		Robot robin = new Robot("Robin", 4, 2.5);
		Robot rob = new Robot("Ronja", 5, 3.5);
		System.out.println(ronja.equals(robin));
		System.out.println(ronja.equals(rob)); 
	}
}
