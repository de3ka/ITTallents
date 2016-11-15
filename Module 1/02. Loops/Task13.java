
/*
 * Задача 13: Да се състави програма, която извежда всички
естествени трицифрени числа, които имат сбор на цифрите равен
на дадено число.
Дадено : sum, където 2>=sum<=27.
Пример: 26
Изход: 899, 989, 998.
 */
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum;
		do {
			System.out.println("Please enter a sum in the interval sum>=2 && sum<=27:");
			sum = sc.nextInt();
		} while (sum < 2 || sum > 27);

		for (int number = 100; number <= 999; number++) {
			int currentNum = number;

			int lastDigit = currentNum % 10;
			currentNum /= 10;
			int secondDigit = currentNum % 10;
			currentNum /= 10;
			int firstDigit = currentNum % 10;

			if (firstDigit + secondDigit + lastDigit != sum) {
				continue;
			} else {
				currentNum = firstDigit * 100 + secondDigit * 10 + lastDigit;
				System.out.println(currentNum);

			}
		}
		sc.close();

	}
}
