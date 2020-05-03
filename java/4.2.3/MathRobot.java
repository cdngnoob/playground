public class MathRobot {
	public double div(String a, String b) {
		
		/*
		double ergebnis = 0.0;

		int aDouble = Integer.parseInt(a);
		int bDouble = (int) Double.parseDouble(b);

		int zwischenergebnis = aDouble / bDouble;
		ergebnis = zwischenergebnis / (double) 2;

		return ergebnis;
		*/
		
		double foo = Double.parseDouble(a);
		double bar = Double.parseDouble(b);
		double div = foo / bar;
		double result = div / 2;
		return result;
	}
}