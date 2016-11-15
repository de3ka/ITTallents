
/*Задача 1:
Да се прочете масив и да се намери най-малкото число кратно на
3 от масива.
Вход:
10, 3, 5, 8, 6, -3, 7
Най-малкото число кратно на 3 е -3
 */
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		int minElem = 0;
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		minElem = array[0];
		for (int i = 1; i < array.length; i++) {
			if ((array[i] % 3 == 0) && (minElem > array[i])) {
				minElem = array[i];
			}
		}
		if (minElem == 0) {
			System.out.println("No such number");
		} else {
			System.out.println("Min element in the array divisable by 3 is: " + minElem);
		}
		sc.close();
	}
}