
/*
 * Задача 10: Въведете число от клавиатурата и определете дали е
просто. Просто число е това което се дели САМО на 1 и на себе
си.
 */
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		do {
			System.out.println("Please enter a positive number bigger than 1:");
			number = sc.nextInt();
		} while (number <= 1);

		if (number == 2 || number == 3 || number == 5 || number == 7) {
			System.out.println("The number is prime.");

		} else if (number % 2 != 0 && number % 3 != 0 && number % 5 != 0 && number % 7 != 0) {
			System.out.println("The number is prime.");

		} else {
			System.out.println("The number is not prime.");
		}
		sc.close();

	}

}
