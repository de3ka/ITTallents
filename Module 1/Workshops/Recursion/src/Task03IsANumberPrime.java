import java.util.Scanner;

public class Task03IsANumberPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int number;
		do {
			number = sc.nextInt();
		} while (number < 1);
		if (number==1) {
			System.out.println("Prime.");
		}else {
			int temp = number - 1;
			if (primeNumberRecursive(number, temp)) {
				System.out.println("Prime.");
			} else {
				System.out.println("Not prime.");
			}
		}
		sc.close();

	}

	static boolean primeNumberRecursive(int number, int tmp) {
		if (tmp == 1)
			return true;
		else {
			if (number % tmp == 0) {
				return false;
			} else
				return primeNumberRecursive(number, tmp - 1);
		}

	}
}
