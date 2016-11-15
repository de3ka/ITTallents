import java.util.Scanner;

public class Task08second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Please enter new number in the range [1000.. 9999]:");
			number = sc.nextInt();
		} while (number < 1000 || number > 9999);

		int forthDigit = number % 10;
		number = number / 10;

		int thirdDigit = number % 10;
		number = number / 10;

		int secondDigit = number % 10;
		number = number / 10;

		int firstDigit = number;

		int newNumberOne = (firstDigit * 10) + forthDigit;
		int newNumberTwo = (secondDigit * 10) + thirdDigit;

		if (newNumberOne > newNumberTwo) {

			System.out.println(newNumberOne + " is bigger than " + newNumberTwo);

		} else if (newNumberOne < newNumberTwo) {

			System.out.println(newNumberOne + " is smaller than " + newNumberTwo);

		} else {

			System.out.println(newNumberOne + " is equal to " + newNumberTwo);

		}
		sc.close();

	}

}
