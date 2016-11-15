/*
 * Задача 2:
Имате квадратен двумерен масив от естествени числа, чийто стойности
се въвеждат от конзолата. Да се отпечатат диагоналите на масива.
Пример:
1,4,6,3
5,9,7,2
4,8,1,9
2,3,4,5
Изход:
1 9 1 5
3 7 8 2
 */
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter table's rows and colums (rows=colums):");
		int rows = sc.nextInt();
		int colums = rows;
		int[][] table = new int[rows][colums];
		System.out.println("Fill the table with numbers:");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		// print the table
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}

		// find the prime diagonal
		System.out.println("The diagonals of the table are:");
		System.out.print("First-> ");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (i == j) {
					System.out.print(table[i][j] + " ");
				}
			}
		}
		System.out.println();
		// find the secondary diagonal
		System.out.print("Second-> ");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (j == table.length - i - 1) {
					System.out.print(table[i][j] + " ");
				}
			}
		}
		sc.close();

	}

}
