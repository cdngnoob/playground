public class Story {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		int[] numbers = new int[] {8,7};
		System.out.println("Summe: " + calc.calculateSum(numbers));
		System.out.println("Mittel: " + calc.calculateMean(numbers));
	}
}
