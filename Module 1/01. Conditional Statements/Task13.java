
/*
 * Задача 13:
Да се състави програма, която да отгатне колко е студено/топло по
въведената температура t в градус Целзий.
Температурните интервали са:
под -20 ледено студено;
между 0 и -20 - студено;
между 15 и 0 - хладно;
между 25 и 15 - топло;
над 25 – горещо.
Входни данни: цяло число от интервала [-100..100].
Пример: 12
Изход: хладно
 */

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperature;
		do {
			System.out.print("Enter temperature [-100..100]: ");
			temperature = sc.nextInt();
		} while (temperature < -100 || temperature > 100);

		if (temperature < -20) {

			System.out.println("Freezing cold.");

		} else if (temperature >= -20 && temperature <= 0) {

			System.out.println("Cold.");

		} else if (temperature > 0 && temperature <= 15) {

			System.out.println("Chilly.");

		} else if (temperature > 15 && temperature <= 25) {

			System.out.println("Warm.");

		} else if (temperature > 25) {

			System.out.println("Hot.");

		}
		sc.close();

	}
}
