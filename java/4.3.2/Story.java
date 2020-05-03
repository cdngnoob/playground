class Story {

	public static void main(String args[]) {
		Door door = new Door();
		AccessCode haifischbecken = new AccessCode(1, "12.02.2003");
		AccessCode federvieh = new AccessCode(2, "23.02.2016");

		door.addDoorKey("haifischbecken", haifischbecken);
		door.addDoorKey("federvieh", federvieh);

		door.useCode("haifischbecken");
		door.useCode("federvieh");
	}
}
