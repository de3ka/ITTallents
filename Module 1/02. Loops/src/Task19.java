import java.util.Scanner;

public class Task19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Please enter a number in range [10..99]:");
			number = sc.nextInt();
		} while (number < 10 || number > 99);

		do {
			if (number % 2 == 0) {
				number = number / 2;
			} else
				number = 3 * number + 1;
			System.out.print(number + " ");
		} while (number > 1);
		System.out.println();
		sc.close();
	}

}
