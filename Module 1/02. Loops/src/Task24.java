import java.util.Scanner;

public class Task24 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		int reverseNum = 0;

		do {
			System.out.println("Please enter a number in range [10 .. 30000]: ");
			number = sc.nextInt();
		} while (number < 10 || number > 30000);

		int tempNum = number;

		do {
			int digit = number % 10;
			reverseNum = (reverseNum * 10) + digit;
			number /= 10;
		} while (number > 0);

		if (reverseNum == tempNum) {
			System.out.println(tempNum + " is palindorme.");
		} else {
			System.out.println(tempNum + " is not palindrome.");
		}
		sc.close();
	}

}
