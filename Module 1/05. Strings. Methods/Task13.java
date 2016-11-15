/*
 * Задача 13:
Да се създаде метод, който приема два масива от числа и връща
масив, съдържащ всички елементи на подадените масиви, като в
първата част на масива са елементите на първия подаден масив,
а във втората част – тези на втория подаден масив.
 */
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of first array:");
		int num = sc.nextInt();
		System.out.println("Please enter size of second array:");
		int num2 = sc.nextInt();
		int[] arr1 = new int[num];
		int[] arr2 = new int[num2];
		System.out.println("Fill first array with numbers:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("Fill second array with numbers:");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int[] combined = combineArrays(arr1, arr2);
		System.out.println("The combined array is:");
		System.out.print("[");
		for (int i = 0; i < combined.length; i++) {
			if (i != combined.length - 1) {
				System.out.print(combined[i] + ", ");
			} else {
				System.out.print(combined[i] + "]");
			}

		}
		sc.close();
	}

	static int[] combineArrays(int[] arrOne, int[] arrTwo) {
		int[] arrCombine = new int[arrOne.length + arrTwo.length];
		for (int i = 0; i < arrCombine.length; i++) {
			if (i < arrOne.length) {
				arrCombine[i] = arrOne[i];
			} else {
				arrCombine[i] = arrTwo[i - arrOne.length];
			}
		}
		return arrCombine;
	}
}
