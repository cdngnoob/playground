class Story {
	public static void main(String args[]) {
		Robot rob = new Robot();
		DetectiveRobot ronja = new DetectiveRobot();
		System.out.println("Die normale Laufzeit beträgt " + rob.giveBatteryRuntime() + " Stunden.");
		System.out.println("Ronjas Laufzeit beträgt " + ronja.giveTotalBatteryRuntime() + " Stunden.");
	}
}
