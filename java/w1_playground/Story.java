class Story {

	public static void main(String[] args) {
		Robot robin;
		robin = new Robot();
		
		ReadingRobot bookworm = new ReadingRobot();
		ReadingRobot alex = new ReadingRobot();

		robin.getTask();
		alex.getTask();

		System.out.println(robin.getTask());
		System.out.println(alex.getTask());
		System.out.println(alex.sayAge()); 
	}

}