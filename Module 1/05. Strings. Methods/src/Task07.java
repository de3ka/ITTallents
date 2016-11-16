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
