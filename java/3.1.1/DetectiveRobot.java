class DetectiveRobot {

    String informant = "geheimer Informant";

	public DetectiveRobot() {
	    name = "Ronja";
	    destination = "Eikes Geheimquartier";
	    changeBatteryRuntime(8);
	}

	String questioningInformant() {
		 return "Ich bewege mich nach " + destination + "\nund befrage dort " + informant + ".";
	}
	
	@Override
	String robotDetails() {
	    String infoString = "Meine Laufzeit beträgt " + batteryRuntime + " Stunden.\n";
        infoString += "Meine aktuelle Aufgabe: " + questioningInformant();
        
        return infoString;
    }

}
