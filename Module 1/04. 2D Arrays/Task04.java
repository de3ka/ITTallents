/*
 * Задача 4:
Имате предварително въведени стойности на елементи в двумерен
масив - естествени числа.
Да се състави програма, чрез която се извеждат стойностите на
елементите в двумерен масив след обръщането му на +90 градуса.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход
13,9,5,1
14,10,6,2
15,11,7,3
16,12,8,4
 */
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ot rows of the array:");
		int rows = sc.nextInt();
		System.out.println("Enter size of colums of the array:");
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];
		
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		// print the entered array
		System.out.println("Printing the entered array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// flip array to +90 degrees
		int[][] rotated = new int[rows][cols];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				rotated[i][j] = array[array[i].length - j - 1][i];
			}
		}
		
		// print the rotated array
		System.out.println("Printig the rotated array:");
		for (int i = 0; i < rotated.length; i++) {
			for (int j = 0; j < rotated[i].length; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
