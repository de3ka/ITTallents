/*
 * Задача 6:
Напишете програма, която първо чете 2 масива и после извежда
съобщение дали са еднакви, и дали са с еднакъв размер.
 */
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean areSameElements = true;

		System.out.println("Enter first array size:");
		int arrayOneLength = sc.nextInt();
		int[] arrayOne = new int[arrayOneLength];
		System.out.println("Fill firs array with numbers:");
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = sc.nextInt();
		}
		System.out.println("Enter second array size:");
		int arrayTwoLength = sc.nextInt();
		int[] arrayTwo = new int[arrayTwoLength];
		System.out.println("Fill second array with numbers:");
		for (int i = 0; i < arrayTwo.length; i++) {
			arrayTwo[i] = sc.nextInt();
		}

		System.out.println("The two arrays:");
		if (arrayOneLength == arrayTwoLength) {
			System.out.println("Are the same size.");
			for (int i = 0; i < arrayOne.length; i++) {
				if (arrayOne[i] != arrayTwo[i]) {
					areSameElements = false;
					break;
				}
			}
			System.out.println(areSameElements ? "Have same elements" : "Don't have same elements");
		}
		if (arrayOneLength != arrayTwoLength) {
			System.out.println("Are not the same size");
			System.out.println("Don't have same elements.");
		}
		sc.close();
	}

}
