import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter 3 digit number with digits not equal to 0: ");
			number = sc.nextInt();
		} while (number < 100 || number > 999);

		int temp = number;
		int thirdDigit = number % 10;
		number = number / 10;
		int secondDigit = number % 10;
		number = number / 10;
		int firstDigit = number % 10;

		if (firstDigit != 0 && secondDigit != 0 && thirdDigit != 0) {
			if ((temp % firstDigit == 0) && (temp % secondDigit == 0) && (temp % thirdDigit == 0)) {

				System.out.println("The number is divisable by all it's digits.");

			} else {

				System.out.println("The number is not divisable by all it's digits.");

			}
		} else {
			System.out.println("Eror, one of the entered digits is equal to 0. Please enter another number!");
		}

		sc.close();

	}
}
