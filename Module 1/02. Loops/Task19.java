
/*
 * Задача 19: Да се състави програма, чрез която по въведено
естествено число от интервала [10..99] се извежда поредица
числа, при спазване на следните изисквания:
1) ако предходното число е четно се извежда 0.5*числото;
2) ако предходното число е нечетно се извежда 3*числото +1.
Извеждането продължава докато не се получи стойност 1.
Пример: 11
Изход: 34 17 52 26 13 40 20 10 5 16 8 4 2 1.
 */
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
