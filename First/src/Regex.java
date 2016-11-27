import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {

		String inputFirstName;
		String inputEmail;
		ArrayList<String> listOfFirstName = new ArrayList<>();

		Scanner scanner = new Scanner(System.in);
		int attempts = scanner.nextInt();
		for (int a = 0; a < attempts; a++) {

			inputFirstName = scanner.next();
			inputEmail = scanner.next();

			boolean matches = Pattern.matches("^.*@gmail.com$", inputEmail);

			if (matches) {
				listOfFirstName.add(inputFirstName);
			}

		}

		Collections.sort(listOfFirstName);
		for(String firstName: listOfFirstName) {
			System.out.println(firstName);
		}

	}

}
