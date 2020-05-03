class Story {

	public static void main(String[] args) {
		Robot robin = new Robot();
		robin.saveClues();
		for (int i = 0; i < 3; i++) {
            System.out.println(robin.clues[i]);
        }
	}
}
