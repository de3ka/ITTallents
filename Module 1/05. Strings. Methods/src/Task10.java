import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter a word:");
		String inputString=sc.nextLine();
		for (int i = 0; i < inputString.length(); i++) {
			char exitWord=(char)(inputString.charAt(i)+5);
			System.out.print(exitWord);
		}
		sc.close();
	}
}
