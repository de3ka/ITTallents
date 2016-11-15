
/*
 * Задача 7:
Да се състави програма, която чете набор от думи разделени с
интервал.
Като резултат да се извеждат броя на въведените думи, както и броя
знаци в най-дългата дума.
Пример: asd fg hjkl
Изход: 3 думи, най-дългата е с 4 символа.
 */
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] wordsArray = sentence.split(" ");
		int maxSizeOfWord = 0;
		int wordsCount = 0;
		for (int i = 0; i < wordsArray.length; i++) {
			if (wordsArray[i].length() > maxSizeOfWord) {
				maxSizeOfWord = wordsArray[i].length();
				wordsCount = wordsArray.length;
			}

		}
		System.out.println(wordsCount + " words, the longest of which has " + maxSizeOfWord + " letters.");
		sc.close();
	}

}
