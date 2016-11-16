//works only with positive integers

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array's rows:");
		int rows = sc.nextInt();
		System.out.println("Enter the size of array's colums");
		int cols = sc.nextInt();
		int[][] table = new int[rows][cols];
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		// the printed table looks like
		System.out.println("The printed table looks like");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		// finding the row with max sum and it's index
		System.out.println();
		double maxSum = 0;
		int maxIndex = 0;
		for (int i = 0; i < table.length; i++) {
			double rowSum = 0;
			for (int j = 0; j < table[i].length; j++) {
				rowSum += table[i][j];
				if (rowSum > maxSum) {
					maxSum = rowSum;
					maxIndex = i;
				}

			}
		}
		System.out.println("The index of the row with largest sum is: " + maxIndex);
		System.out.println("The max sum by rows is: " + maxSum);
		sc.close();

	}

}
