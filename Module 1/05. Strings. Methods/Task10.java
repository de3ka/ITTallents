/*
 * Задача 10:
Да се състави програма, която по даден низ връща друг,
символите, на който са получени като към всеки код на символ
от ASCII таблицата е добавеното числото 5 и е записан
новополучения символ.
Пример :
Вход: Hello
Изход: Mjqqt
 */
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
