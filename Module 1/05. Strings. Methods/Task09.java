
/*
 * Задача 9:
Да се състави програма, чрез която по въведен низ съдържащ букви,
цифри, знак минус '-' се извежда сборът на въведените числа като се
отчита знакът '-' пред съответното число.
Вход: asd-12sdf45-56asdf100
Изход:
-12
45
-56
100
Сума = 77
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a text with letters, digits and '-' sign:");
		String text = sc.nextLine();
		int temp = 0;
		int sum = 0;
		for (int i = 0; i < text.length(); i++) {
			if (Character.isDigit(text.charAt(i))) {
				String str = "";
				do {
					str = str + text.charAt(i);
					if (i < (text.length() - 1)) {
						i++;
					} else {
						break;
					}
				} while (Character.isDigit(text.charAt(i)));
				System.out.print(str);
				System.out.println();
				temp = Integer.parseInt(str);
				sum = sum + temp;
			}
			if (text.charAt(i) == '-') {
				String str = "";
				do {
					str = str + text.charAt(i);
					if (i < (text.length() - 1)) {
						i++;
					} else {
						break;
					}
				} while (Character.isDigit(text.charAt(i)));
				System.out.print(str);
				System.out.println();
				temp = Integer.parseInt(str);
				sum = sum + temp;
			}
		}
		System.out.println("the sum of all numbers in the string is: " + sum);
		sc.close();
	}
}