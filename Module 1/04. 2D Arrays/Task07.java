/*
 * Задача 7:
Имате предварително въведени стойности от естествени числа,
въведени в квадратна таблица с размери 6 реда и 6 колони.
Да се състави програма , чрез която се намира сумата на всички
елементи, чиято сума на индекси за ред и колона е четно число.
Програмата да извежда формираните суми за всеки отделен ред на
квадратната таблица, както и общата сума от тези елементи.
Да се използва само един цикъл.
Пример:
11,12,13,14,15,16,
21,22,23,24,25,26,
31,32,33,34,35,36,
41,42,43,44,45,46,
51,52,53,54,55,56,
61,62,63,64,65,66
Изход:
11, ,13, ,15, , сума от елементите за реда: 39
22, ,24, ,26, сума от елементите за реда: 72
31, ,33, ,35, , сума от елементите за реда: 99
42, ,44, ,46, сума от елементите за реда: 132
51, ,53, ,55, , сума от елементите за реда: 159
62, ,64, ,66 сума от елементите за реда: 192
Сума на елементите: 693
 */
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 6;
		int cols = rows;
		int[][] array = new int[rows][cols];
		System.out.println("Fill array with size 6x6 with numbers:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		// printing the array
		System.out.println("Printing the aray:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		// finding the sum of each even elements in all the rows in the array
		// and printing the overall sum of those elements
		System.out.println("Printing each even element in array and their sum for each row:");
		int OverallSum = 0;
		int sumOfElemensInRow = 0;
		for (int i = 0; i < array.length; i++) {
			sumOfElemensInRow = 0;
			for (int j = 0; j < array[i].length; j++) {
				if ((i + j) % 2 == 0) {
					sumOfElemensInRow += array[i][j];
					OverallSum += array[i][j];
					System.out.print(array[i][j] + " ");
				}
			}
			System.out.println();
			System.out.print("- Sum of all elements in row is: " + sumOfElemensInRow);
			System.out.println();
		}
		System.out.println("Overall sum of even elements in the array is: " + OverallSum);
		sc.close();
	}

}
