import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringOne;
		String stringTwo;

		do {
			System.out.println("Enter two strings of words with letters between 10 and 20 each");
			stringOne = sc.nextLine();
			stringTwo=sc.nextLine();
		} while (stringOne.length() > 20 || stringOne.length() < 5 || stringTwo.length()>20 ||stringTwo.length()<5);

		// exchanging the first 5 letters between the strings
		String string1replaced = stringOne.replaceAll(stringOne.substring(0,5), stringTwo.substring(0,5));
		String string2replaced = stringTwo.replaceAll(stringTwo.substring(0,5), stringOne.substring(0,5));

		// finding the longest word and printing its changed word order and its
		// length
		if (string1replaced.length() > string2replaced.length()) {
			System.out.println(string1replaced.length() + " " + string1replaced);
		} else if (string2replaced.length() > string1replaced.length()) {
			System.out.println(string2replaced.length() + " " + string2replaced);
		} else
			System.out.println(string1replaced.length() + " " + string1replaced + " " + string2replaced);
		sc.close();
	}

}
