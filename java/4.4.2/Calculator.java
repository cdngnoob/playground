public class Calculator {

	int calculateSum(int[] numbers) {
		int summe = 0;
		for (int i : numbers) {
		    summe = summe + i;    
		}
		
		return summe;
	}

	double calculateMean(int[] numbers) {
		double sum = calculateSum(numbers);
		int len = numbers.length;
        sum = sum / len;
        
        return sum;
	}
}
