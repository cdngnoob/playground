public class Robot {

	private String name;
	private int age;
	private double batteryRuntime;

	Robot(String name, int age, double batteryRuntime) {
		this.name = name;
		this.age = age;
		this.batteryRuntime = batteryRuntime;
	}
	
	@Override
	public boolean equals(Object foo) {
		if (foo != null && this.name.equals(((Robot) foo).name) && this.age == ((Robot) foo).age && this.batteryRuntime == ((Robot) foo).batteryRuntime) {
			return true;
		} else {
			return false;
		}
	}
}