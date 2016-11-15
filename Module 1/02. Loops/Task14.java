
/*
 * Задача 14: Да се състави програма, която по въведено
естествено число N от интервала [10..200] извежда в обратен
ред всички числа, които са кратни на 7 и са по-малки от N.
 */
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		do {
			System.out.println("Please enter a number in the interval [10..200]:");
			number = sc.nextInt();
		} while (number < 10 || number > 200);
		
		System.out.print("Numbers between 10 and " + number + " , divisable by 7 and printed in reverse order are: ");
		
		for (int i = 200; i >=10; i--) {
			if (i%7==0 && i<=number) {
				
				System.out.print(i+", ");
			}
		}
		sc.close();

	}

}
