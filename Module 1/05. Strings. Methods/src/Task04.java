import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringWithSpaces = sc.nextLine();
		String[] words = stringWithSpaces.split(",", 2);

		// removing all spaces between the names
		String joinedString = stringWithSpaces.replaceAll("\\s", "");
		int asciicounter1 = 0;
		int asciicounter2 = 0;
		int sum1 = 0;
		int sum2 = 0;

		// splitting the string to 2 string, separated by comma
		String[] partsOfString = joinedString.split(",", 2);

		for (int i = 0; i < partsOfString[0].length(); i++) {
			char c = partsOfString[0].charAt(i);
			asciicounter1 = (int) c;
			sum1 += asciicounter1;
			asciicounter1++;
		}

		for (int i = 0; i < partsOfString[1].length(); i++) {
			char ch = partsOfString[1].charAt(i);
			asciicounter2 = (int) ch;
			sum2 += asciicounter2;
			asciicounter2++;
		}

		if (sum1 > sum2) {
			System.out.println(words[0].trim());
		} else if (sum2 > sum1) {
			System.out.println(words[1].trim());
		} else {
			System.out.println("The sums of the ASCII codes of the letters in the two names are equal.");
		}
		sc.close();

	}

}
