class Story {

	public static void main(String[] args) {
		MainEntranceOpener meo = new MainEntranceOpener();
		if (meo.open("MainEntrance")) {
			System.out.println("Das Tor des Haupteingangs wurde geöffnet.");
		}
		
	    if (!meo.open("GardenDoor")) {
            System.out.println("Das Gartentor bleibt zu.");
        }
	}
}
