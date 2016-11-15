
/*
 * Задача 8:
Напишете програма, която намира и извежда най-дългата редица от
еднакви поредни елементи в даден масив.
 */
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		System.out.println("Fill the array with elements:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int currentMaxSequence = 0; // broqch, sledqsht povtoreniqta
		int longestSequence = 0; // maksimalniqt broi na broqcha ,dostignat pri
									// povtoreniqta
		int arrayIndex = 0; // tekushtiqt indeks w masiva

		for (int i = 0; i < array.length; i++) {
			currentMaxSequence = 0;
			int j = i;
			while (array[i] == array[j]) {
				currentMaxSequence++;
				j++;
				if (j >= array.length) {
					break;
				}
			}
			if (currentMaxSequence > longestSequence) {
				longestSequence = currentMaxSequence;
				arrayIndex = i;
			}
		}
		if (longestSequence == 1) {
			System.out.println("There is no longest sequence of repating elements.");
		} else {
			System.out.println("Longest sequence of equal elements in the array is:");
			System.out.print("[");
			for (int i = arrayIndex; i < arrayIndex + longestSequence; i++) {
				if (i != arrayIndex + longestSequence - 1) {
					System.out.print(array[i] + ", ");
				} else {
					System.out.print(array[i] + "]");
				}
			}
		}

		sc.close();

	}

}
