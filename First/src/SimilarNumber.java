import java.util.HashMap;

public class SimilarNumber {

	public int solution(int n) {
		int possibleSimilarNumber = 0;

		if (n > 0) {
			HashMap<Integer, Integer> digitsCounterHashMap = new HashMap<>();

			int num = n, digit = 0, numberOfDigits = 0;
			while (num != 0) {
				digit = num % 10;
				if (digitsCounterHashMap.get((Integer) digit) == null) {
					digitsCounterHashMap.put((Integer) digit, (Integer) 1);
				} else {
					int valueAtThePosition = digitsCounterHashMap.get((Integer) digit).intValue();
					digitsCounterHashMap.put((Integer) digit, (Integer) (valueAtThePosition + 1));
				}
				numberOfDigits++;

				num = num / 10;
			}

			//System.out.println("HashMap : " + digitsCounterHashMap + " number of digits : " + numberOfDigits);

			Integer zeroInteger = digitsCounterHashMap.get((Integer) 0);
			int numberOfZeros = zeroInteger == null ? 0 : zeroInteger.intValue();

			long numeratorValue = (numberOfDigits - numberOfZeros) * factorial(numberOfDigits - 1);
			long denominatorValue = 1;

			// Requires finding the duplicates
			for (int i = 0; i <= 9; i++) { // Loop through all the digits
				Integer valueInteger = digitsCounterHashMap.get((Integer) i);
				int valueOfInteger = valueInteger == null ? 1 : valueInteger.intValue();
				denominatorValue *= factorial(valueOfInteger);
			}

			possibleSimilarNumber = (int) (numeratorValue / denominatorValue);
		}
		return possibleSimilarNumber;
	}

	public long factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}

	public static void main(String[] args) {
		SimilarNumber similarNumber = new SimilarNumber();
		int possibleSimilarNumber = similarNumber.solution(12);

		System.out.println("Possibilities : " + possibleSimilarNumber);
	}

}
