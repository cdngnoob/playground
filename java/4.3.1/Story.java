class Story {

	 public static void main(String args[]) {
        Robot ronja = new Robot();
        for (int i = 0; i < ronja.getAccessCodes().size(); i++) {
            System.out.println(ronja.getAccessCode(i));
        }
    }
}