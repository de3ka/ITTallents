
/*
 *Задача 15:
Да се състави програма, която въвежда естествено число от интервала
[0..24].
Програмата да изведе съответстващо съобщение съобразно въведения
час.
Периодите са:
[18..4] - Добър вечер;
[4..9] - Добро утро;
[9..18] - Добър ден
Пример: 10
Изход: Добър ден
 */
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour;
		do {
			System.out.print("Enter hour:");
			hour = sc.nextInt();
		} while (hour < 0 || hour > 24);

		if (hour >= 4 && hour < 9) {

			System.out.println("Good morning.");

		} else if (hour >= 9 && hour < 18) {

			System.out.println("Good day.");

		} else if (hour >= 18 && hour <= 24) {
			
			System.out.println("Good evening.");
			
		} else if (hour >= 0 && hour < 4) {
			
			System.out.println("Good evening.");
		}
		sc.close();
	}
}
