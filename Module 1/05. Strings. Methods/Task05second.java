
/*
 * Задача 5:
Да се състави програма, чрез която се въвеждат 2 редици от знаци
(думи).
Ако в двете редици участва един и същи знак, да се изведе на екрана
първата редица хоризонтално, а втората вертикално, така че да се
пресичат в общия си знак.
Ако редиците нямат общ знак да се изведе само уведомително
съобщение.
Пример :
м
а
шапка
и
н
а
 */
import java.util.Scanner;

public class Task05second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstWord = sc.nextLine();
		String secondWord = sc.nextLine();
		int wordCrossCounter = 0;
		String empty = "";
		int wordMatch1 = 0;
		int wordMatch2 = 0;
		boolean isMatch = false;

		for (int i = 0; i < firstWord.length() && !isMatch; i++) {
			for (int j = 0; j < secondWord.length(); j++) {
				if (firstWord.charAt(i) == secondWord.charAt(j)) {
					wordMatch1 = i;
					wordMatch2 = j;
					wordCrossCounter++;
					isMatch = true;
					break;
				}
			}
		}
		if (wordCrossCounter == 0) {
			System.out.println("There is no common letter between the words.");
		} else {
			for (int i = 0; i < wordMatch2; i++) {
				empty = empty + " ";
			}
			for (int i = 0; i < firstWord.length(); i++) {
				if (i == wordMatch1) {
					System.out.println(secondWord);
				} else {
					System.out.println(empty + firstWord.charAt(i));
				} 
			}
		}
		sc.close();

	}
}