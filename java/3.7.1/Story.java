class Story {

	public static void main(String[] args) {
		Robot[] robots = new Robot[2];
		robots[0] = new DetectiveRobot();
		robots[1] = new ReadingRobot();
		for (int i=0; i < robots.length; i++) {
			robots[i].saySomething();
		} 
	}
}
