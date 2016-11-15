
/*
 * Задача 5:
Да се състави програма, при която предварително са въведени
естествени числа в двумерен масив 4*4 елемента.
Програмата да извежда резултат от проверката какво е съотношението
на най-голямата сума по редове спрямо най-голямата сума по колони.
Пример:
1,2,3,4
5,6,7,8
9,10,11,12
13,14,15,16
Изход:
най-голяма сума по редове 58
най-голяма сума по колони 40
Максималната сума по редове е > от максималната сума по колони
 */
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 4;
		int cols = 4;
		int[][] array = new int[rows][cols];
		System.out.println("Fill array with size 4x4 with numbers");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		// printing the entered array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// max sum by rows
		int maxSum = 0;
		for (int i = 0; i < array.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < array[i].length; j++) {
				rowSum += array[i][j];
			}
			if (i == 0) {
				maxSum = rowSum;
			} else if (rowSum > maxSum) {
				maxSum = rowSum;
			}
		}

		System.out.println("The max sum by rows is: " + maxSum);

		// max sum by cols
		int maxSumCols = 0;
		for (int i = 0; i < array.length; i++) {
			int colSum = 0;
			for (int j = 0; j < array[i].length; j++) {
				colSum += array[j][i];
			}
			if (i == 0) {
				maxSumCols = colSum;
			} else if (colSum > maxSumCols) {
				maxSumCols = colSum;
			}
		}
		System.out.println("The max sum by colums is: " + maxSumCols);
		if (maxSum > maxSumCols) {
			System.out.println("The max sum by rows is bigger than the max sum by colums.");
		} else if (maxSumCols > maxSum) {
			System.out.println("The max sum by colums is bigger than the max sum by rows.");
		} else {
			System.out.println("The max sum by rows is equal to the max sum by colums.");
		}
		sc.close();
	}
}
