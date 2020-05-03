public class Story {
	public static void main(String[] args) {
		Robot[] robots = new Robot[3];
		robots[0] = new Robot("Ronja");
		robots[1] = new Robot("Robin");
		robots[2] = new Robot("Alex");
		
		for (Robot i : robots) {
			System.out.println(i.getAccessCode());
		}
	}
}
