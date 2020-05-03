class Story {
	public static void main(String[] args) {
		OldRobot robin = new OldRobot();
		Robot ronja = new Robot();
		robin.greetUser();
		ronja.greetUser();
		System.out.println(robin.getInternalStorageSize());
		System.out.println(ronja.getInternalStorageSize());
	}
}
