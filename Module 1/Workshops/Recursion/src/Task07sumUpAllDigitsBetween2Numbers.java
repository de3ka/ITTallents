import java.util.Scanner;

public class Task07sumUpAllDigitsBetween2Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lowerBound;
		int upperBound;
		do {
			lowerBound = sc.nextInt();
			upperBound = sc.nextInt();
		} while (lowerBound < 1 || lowerBound > 10001 || upperBound < 1 || lowerBound > 10001);

		int sumNumsInRange = 0;
		int result = 0;
		for (int i = lowerBound; i <= upperBound; i++) {
			result += sumDigits(i, sumNumsInRange);
		}
		System.out.println(result);
	}

	// recursive function to calculate the sum of a digit
	static int sumDigits(int num, int sum) {
		if (num == 0) {
			return sum;
		} else {
			int tmp = 0;
			tmp = num % 10;
			sum += tmp;
			return sumDigits(num / 10, sum);
		}
	}
}
