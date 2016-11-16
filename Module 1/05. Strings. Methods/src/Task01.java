import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String firstText;
		String secondText;
		do {
			System.out.println("Please enter 2 strings with random text up to 40 characters each:");
			firstText = sc.nextLine();
			secondText = sc.nextLine();
		} while ((firstText.length() < 1 || firstText.length() > 40)
				|| (secondText.length() < 1 || secondText.length() > 40));
		String firstTextUpper = firstText.toUpperCase();
		String firstTextLower = firstText.toLowerCase();
		String secondTextUpper = secondText.toUpperCase();
		String secondTexLower = secondText.toLowerCase();
		System.out.println("The entered texts with all capitals and all lower chars is: ");
		System.out.println(firstTextUpper.concat(" " + firstTextLower + " " + secondTextUpper + " " + secondTexLower));
		sc.close();

	}

}
