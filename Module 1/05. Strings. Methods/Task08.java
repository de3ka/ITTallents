/*
 * Задача 8:
Да се състави програма, чрез която се въвежда ред от символи
(стринг, низ).
Програмата да изведе на екрана дали въведения стринг е палиндром,
т.е. дали четен отляво-надясно и отдясно-наляво е един и същ.
Вход: капак
Изход: да.
Вход: тенджера
Изход: не.
 */
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		char[] letters = text.toCharArray();
		for (int i = 0; i < letters.length / 2; i++) {
			char temp = letters[i];
			letters[i] = letters[letters.length - i - 1];
			letters[letters.length - i - 1] = temp;
		}
		String reverse = new String(letters);
		if (text.equals(reverse)) {
			System.out.println("the word is a palindrome.");
		} else
			System.out.println("The word is not a palindrome.");
		sc.close();
	}

}
