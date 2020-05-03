class Story {

	public static void main(String[] args) {
		RobotCharger charger = new RobotCharger();
		ReadingRobot bookworm = new ReadingRobot();
		DetectiveRobot ronja = new DetectiveRobot();
		charger.chargeRobot(bookworm);
		System.out.println(bookworm.batteryRuntime);
		charger.chargeRobot(ronja);
		System.out.println(ronja.batteryRuntime);
	}

}
