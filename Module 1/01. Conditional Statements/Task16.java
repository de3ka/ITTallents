
/*
 * Задача 16:
Въведено е трицифрено естествено число от вида abc.
Трябва да се провери дали:
ако a = b = c - Изход: цифрите са равни;
ако a>b>c - Изход: цифрите са във възходящ ред;
ако a<b<c цифрите са в низходящ ред;
и изход: цифрите са ненаредени, за неописаните случаи.
Да се състави програма, която извежда резултата от проверката за
наредба на цифрите в числото.
Пример: 345
Изход: възходящ ред.
 */
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter 3 digit number: ");
			number = sc.nextInt();
		} while (number < 100 || number > 999);

		int firstDigit = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int thirdDigit = number % 10;

		if (firstDigit == secondDigit && secondDigit == thirdDigit) {

			System.out.println("All digits are equal.");

		} else if (secondDigit > thirdDigit && secondDigit < firstDigit) {

			System.out.println("The digits are in increasing order.");

		} else if (thirdDigit > secondDigit && secondDigit > firstDigit) {

			System.out.println("The digits are in decreasing order.");

		} else {

			System.out.println("The digits are misplaced.");

		}
		sc.close();

	}

}
