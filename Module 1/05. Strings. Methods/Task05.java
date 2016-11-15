
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

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstString = sc.nextLine();
		String secondString = sc.nextLine();

		int numberOfCrosses = 0;

		for (int i = 0; i < firstString.length(); i++) {
			for (int j = 0; j < secondString.length(); j++) {
				if (firstString.charAt(i) == secondString.charAt(j)) {
					numberOfCrosses++;
					printCross(firstString, i, secondString, j);
					System.out.println();
				}
			}
		}
		if (numberOfCrosses == 0) {
			System.out.println("Words do not cross");
		}
	}

	private static void printCross(String w1, int pos1, String w2, int pos2) {
		String spaces = "";
		for (int i = 0; i < pos1; ++i) {
			spaces += " ";
		}
		for (int i = 0; i < w2.length(); ++i) {
			if (i == pos2) {
				System.out.println(w1);
			} else {
				System.out.println(spaces + w2.charAt(i));
			}
		}
	}

}
