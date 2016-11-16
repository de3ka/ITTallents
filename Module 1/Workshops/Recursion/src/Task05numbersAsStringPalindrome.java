import java.util.Scanner;

public class Task05numbersAsStringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String numberStr = String.valueOf(number);
		// System.out.println(number);

		String reverse = reverseNumberRecursive(numberStr);
		System.out.print(reverse + " - ");
		int numReverse = Integer.parseInt(reverse);
		if (numReverse == number) {
			System.out.print("palindrome");
		} else {
			System.out.print("not a palindrome.");
		}
		sc.close();

	}

	static String reverseNumberRecursive(String str) {
		if (str.length() == 0 || str.length() == 1) {
			return str;
		}
		return reverseNumberRecursive(str.substring(1)) + str.charAt(0);
	}
}
