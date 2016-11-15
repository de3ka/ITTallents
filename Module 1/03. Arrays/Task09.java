
/*
 * Задача 9:
Напишете програма, в която потребителя въвежда масив, след което
елементите на масива се обръщат в обратен ред (Целта не е масива да
се отпечата в обратен ред, ами първо да се обърне, след което да се
отпечата в нормален ред). Пробвайте да решите задачата първо с един
допълнителен масив и после без да използвате друг масив.
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		int[] arrayOne = new int[arrayLength];
		int[] copyArray = new int[arrayOne.length];

		System.out.println("Fill the array with numbers:");
		for (int i = 0; i < arrayOne.length; i++) {
			arrayOne[i] = sc.nextInt();
		}

		System.out.println("Original array is:");
		System.out.print("[");
		for (int i = 0; i < copyArray.length; i++) {
			if (i != arrayOne.length - 1) {
				System.out.print(arrayOne[i] + ", ");
			} else {
				System.out.print(arrayOne[i] + "]");
			}
		}
		System.out.println();
		for (int i = 0; i < copyArray.length; i++) {
			copyArray[i] = arrayOne[copyArray.length - i - 1];
		}

		System.out.println("Printing the reversed array with a secondary array help:");
		System.out.print("[");
		for (int i = 0; i < copyArray.length; i++) {
			if (i != copyArray.length - 1) {
				System.out.print(copyArray[i] + ", ");
			} else {
				System.out.print(copyArray[i] + "]");
			}

		}
		System.out.println();
		// part two - completing the task with no additional array
		for (int i = 0; i < arrayOne.length / 2; i++) {
			int tmp = arrayOne[i];
			arrayOne[i] = arrayOne[arrayOne.length - i - 1];
			arrayOne[arrayOne.length - i - 1] = tmp;
		}
		System.out.println("Printing the reversed array without a secondary array:");
		System.out.print("[");
		for (int i = 0; i < copyArray.length; i++) {
			if (i != arrayOne.length - 1) {
				System.out.print(arrayOne[i] + ", ");
			} else {
				System.out.print(arrayOne[i] + "]");
			}

		}
		sc.close();

	}

}
