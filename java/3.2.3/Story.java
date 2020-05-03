class Story {
	public static void main(String args[]) {
		Robot ronja = new Robot();
		ronja.safeFlushStorage("wrong_pw");
		ronja.safeFlushStorage("pw_duke");
	}
}
