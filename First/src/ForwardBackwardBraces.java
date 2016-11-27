import java.util.ArrayList;
import java.util.Scanner;

public class ForwardBackwardBraces {

	public int solution(String S) {
		int indexMatched = 0;

		if (S.length() > 1) {
			ArrayList<Integer> forwardBracesList = new ArrayList<>();
			ArrayList<Integer> backwardBracesList = new ArrayList<>();

			int counter = 0;
			for (int i = 0; i < S.length(); i++) {
				if (S.charAt(i) == '(') {
					counter++;
				}

				forwardBracesList.add(counter);
				backwardBracesList.add((Integer) 0); // Fill the backward array
				// with dummy value i.e. 0
			}

			counter = 0;// Reset counter
			for (int i = S.length() - 1; i >= 0; i--) {
				if (S.charAt(i) == ')') {
					counter++;
				}

				backwardBracesList.set(i, counter);
			}

			// System.out.println("Forward brace list : " + forwardBracesList);
			// System.out.println("Backward brace list : " +
			// backwardBracesList);

			// Run the loop till length-1. Check whether the number of braces in
			// front at 'i'
			// matches with number if back at 'i+1'
			for (int i = 0; i < S.length() - 1; i++) {
				int numberOfForwardBraces = ((Integer) forwardBracesList.get(i)).intValue();
				int numberOfBackwardBraces = ((Integer) backwardBracesList.get(i + 1)).intValue();
				if (numberOfForwardBraces == numberOfBackwardBraces) {
					indexMatched = i + 1;
					break;
				}
			}
		}

		return indexMatched;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.next();

		ForwardBackwardBraces forwardBackwardBraces = new ForwardBackwardBraces();

		System.out.println("K : " + forwardBackwardBraces.solution(inputString));

	}

}
