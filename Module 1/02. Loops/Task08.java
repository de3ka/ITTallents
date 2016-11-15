
/*
 * Задача 8: По зададено число n, да се изведе на екрана таблица по
следния начин:
Пример:
Въведете n:
1
0
Въведете n:
2
11
33
Въведете n:
3
222
444
666
Въведете n:
4
3333
5555
7777
9999
 */
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int number = sc.nextInt();
		int pattern=number-1;
		
		for (int row = 1; row <=number; row++) {
			for (int col = 1; col <=number; col++) {
				
				System.out.print(pattern);
			}
			pattern+=2;
			System.out.println();
		}
		sc.close();

	}

}
