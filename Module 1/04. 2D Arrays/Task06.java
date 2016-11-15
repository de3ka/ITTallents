/*
 * Задача 6:
Имате предварително въведени стойности от естествени числа.
Числата са въведени в квадратна таблица с размери 6 реда и 6
колони.
Да се състави програма, чрез която се намира сумата на всички
елементи от редовете с четни номера: 2,4 и 6.
Програмата да извежда и сумата на всеки отделен ред.
Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
Изход:
21,22,23,24,25,26 сума 141
41,42,43,44,45,46 сума 261
61,62,63,64,65,66 сума 381
Сума на елементите 783
 */
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 6;
		int cols = rows;
		int[][] array = new int[rows][cols];
		System.out.println("Filling the array with size 6x6 with numbers:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		// printing the table
		System.out.println("The array looks like this:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// finding the overall sum of all ever rows and the sum of elements in
		// each even row
		System.out.println("Printing each even row and it's sum of elements:");
		int sumOfRows = 0;
		int sumOfEachRow = 0;
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 1) {
				sumOfEachRow = 0;
				for (int j = 0; j < array[i].length; j++) {
					sumOfRows += array[i][j];
					sumOfEachRow += array[i][j];
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
				System.out.print("- Sum of all elements in row is: " + sumOfEachRow);
				System.out.println();
			}
		}
		System.out.println("Overall sum of the elements in even rows of the array is: " + sumOfRows);
		sc.close();

	}

}
