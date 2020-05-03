class DetectiveRobot extends Robot {

	DetectiveRobot() {
        batteryRuntime = 5;
        canSpeak = true;
	}

	void speak() {
	    if (canSpeak) {
		    System.out.println("Ich heiße Ronja und meine Batterie hält " + batteryRuntime + " Stunden.");
	    }
    }
}
