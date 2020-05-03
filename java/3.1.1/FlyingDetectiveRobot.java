class FlyingDetectiveRobot {

    boolean isFlying;

	public FlyingDetectiveRobot() {
	    name = "Rolf";
	    destination = "kurz vor den Wolken";
	    isFlying = true;
	}
	
	@Override
	String robotDetails() {
	    String infoString = "Meine Laufzeit beträgt " + batteryRuntime + " Stunden. Ich kann fliegen.\n";
	    if (isFlying) {
            infoString += "Momentan fliege ich. Ich lande jetzt. ";
            toggleFlyingMode();
            infoString += "Gelandet.\n";
        } else {
            infoString += "Ich fliege nicht. Ich schalte Fliegen jetzt ein. ";
            toggleFlyingMode();
            infoString += "Fliegen Gestartet.\n";
        }
        
        infoString += "Meine aktuelle Aufgabe: " + questioningInformant();
        return infoString;
    }

    void toggleFlyingMode() {
        isFlying = !isFlying;
    }
    
}
