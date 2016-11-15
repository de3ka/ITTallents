
/*
 * Задача 3:
Да се състави програма, чрез която се въвеждат последователно две
редици от символи без интервали.
Програмата да извежда съобщение за резултата от сравнението им по
позиции.
Пример: хипопотам, хипопотук
Изход:
Двата низа са с равна дължина.
Разлика по позиции:
8 а-у
9 м-к
 */
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringOne = sc.nextLine();
		String stringTwo = sc.nextLine();
		int arrayLength = 0;
		int index = 0;

		// difference between lengths
		if (stringOne.length() > stringTwo.length()) {
			System.out.println("The length of the first string is greater than the length of the second.");
			arrayLength = stringTwo.length();
		} else if (stringTwo.length() < stringOne.length()) {
			System.out.println("The length of the second string is greater than the length of the first.");
			arrayLength = stringOne.length();
		} else {
			System.out.println("The two strings have equal lengths.");
			arrayLength = stringOne.length();
		}

		// difference by positions of chars in strings
		if (stringOne.equals(stringTwo)) {
			System.out.println("The string have no differences by their letters.");
		} else {
			for (int i = 0; i < arrayLength; i++) {
				if (stringOne.charAt(i) != stringTwo.charAt(i)) {
					index = i + 1;
					System.out.println(index + " " + stringOne.charAt(i) + " - " + stringTwo.charAt(i) + " ");
				}
			}
		}
		sc.close();
	}
}
