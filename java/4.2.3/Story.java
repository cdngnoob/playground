public class Story {
	public static void main(final String args[]) {
		MathRobot ronja = new MathRobot();
		System.out.println("a = 2, b = 3: " + ronja.div("2", "3"));
		System.out.println("a = 6.6, b = 2: " + ronja.div("6.6", "2"));
		System.out.println("a = 1.0, b = 1: " + ronja.div("1.0", "1"));
		System.out.println("a = 5, b = 2.5: " + ronja.div("5", "2.5"));
	}
}
