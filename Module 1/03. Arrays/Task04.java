
/*
 * Задача 4:
Да се прочете масив и да се отпечата дали е огледален.
Следните масиви са огледални:
[3 7 7 3]
[4]
[1 55 1]
[6 27 -1 5 7 7 5 -1 27 6]
 */
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int arrayLenght = sc.nextInt();
		int[] array = new int[arrayLenght];
		boolean flag = true;

		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
			if (array[i] != array[j]) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "The array is mirrored." : "The array is not mirrored.");
		sc.close();

	}
}
