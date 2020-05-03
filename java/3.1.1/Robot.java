class Robot {
	int batteryRuntime;
	String name;
	String destination;
	
	public Robot() {
	    name = "Robin";
	    destination = "Dukes Wohnung";
	    batteryRuntime = 2;
	}

    void changeBatteryRuntime(int newBatteryRuntime) {
        batteryRuntime = newBatteryRuntime;
    }
    
    String robotDetails() {
        return "Meine Laufzeit beträgt " + batteryRuntime + " Stunden.";
    }
	
	void printInfo() {
	    System.out.println("Informationen zum Roboter:");
	    System.out.println("Ich bin " + name + ".");
	    System.out.println(robotDetails());
	    System.out.println("Mein Ziel ist " + destination + ".");
	    System.out.println("---");
	}
}