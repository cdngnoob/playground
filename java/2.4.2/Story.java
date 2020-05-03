class Story {

	public static void main(String[] args) {
		RandomNumberGreaterTen numberGreaterTen = new RandomNumberGreaterTen();
		for (int i=0; i<5; i++) {
			System.out.println(numberGreaterTen.greaterTen());
		}
	}
}
