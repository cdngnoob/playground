class Story {

	public static void main(String[] args) {
		Robot ronja = new Robot();
		ronja.setBatteryRuntime(-1);
		System.out.println(ronja.getBatteryRuntime());
		ronja.setBatteryRuntime(5);
		System.out.println(ronja.getBatteryRuntime());
	}
}
