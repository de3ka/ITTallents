
/*
 * Задача 22:
Да се състави програма, която извежда първите 10 най-малки
числа, които се делят на 2, 3 или на 5 и които са по-големи от
въведено естествено число.
Числата се извеждат, заедно с техния пореден номер.
Входни данни: число от интервала [1..999]
Пример: 1
Изход: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
Използвайте цикъл while.
 */
import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		do {
			System.out.println("Please enter a number in the interval [1..999]: ");
			number = sc.nextInt();
		} while (number < 1 || number > 999);

		int count = 1;

		while (count <= 10) {

			if (number % 2 == 0) {
				System.out.print(count + ":");
				System.out.print(number + ", ");
				count++;
			} else if (number % 3 == 0) {
				System.out.print(count + ":");
				System.out.print(number + ", ");
				count++;
			} else if (number % 5 == 0) {
				System.out.print(count + ":");
				System.out.print(number + ", ");
				count++;
			}
			number++;
		}
		System.out.println();
		sc.close();
	}
}
