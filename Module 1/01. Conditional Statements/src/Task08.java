import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter new number in the range [1000.. 9999]:");
		int number = sc.nextInt();
		if (number < 1000 || number > 9999) {
			System.out.println("Wrong format! Please enter new number in the range [1000.. 9999]");
			number = sc.nextInt();
		}
		int forthDigit = number % 10;
		number = number / 10;

		int thirdDigit = number % 10;
		number = number / 10;

		int secondDigit = number % 10;
		number = number / 10;

		int firstDigit = number;

		String newDigitOne = Integer.toString(firstDigit);
		String newDigitTwo = Integer.toString(secondDigit);
		String newDigitThree = Integer.toString(thirdDigit);
		String newDigitFour = Integer.toString(forthDigit);

		String newFirstNum = newDigitOne + newDigitFour;
		String newSecondNum = newDigitTwo + newDigitThree;
		int newFirstNum1 = Integer.parseInt(newFirstNum);
		int newSecondNum2 = Integer.parseInt(newSecondNum);

		if (newFirstNum1 > newSecondNum2) {
			System.out.println(newFirstNum1 + " is greater than " + newSecondNum2);
		} else if (newFirstNum1 < newSecondNum2) {
			System.out.println(newFirstNum1 + " is lesser than " + newSecondNum2);
		} else {
			System.out.println(newFirstNum1 + " is equal to " + newSecondNum2);
		}

		sc.close();

	}

}
