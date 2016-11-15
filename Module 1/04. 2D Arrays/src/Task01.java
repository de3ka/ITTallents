import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rows = 6;
		int cols = 5;

		int[][] table = new int[rows][cols];
		System.out.println("Fill table with size 6x5 with numbers");
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				table[i][j] = sc.nextInt();
			}
		}
		// printing the table
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				System.out.print(table[i][j] + " ");
			}
			System.out.println();
		}
		// searching for max element in the array
		int max = table[0][0];
		int min = table[0][0];
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[i].length; j++) {
				if (max < table[i][j]) {
					max = table[i][j];

				}

			}
			for (int j = 0; j < table[i].length; j++) {
				if (min > table[i][j]) {
					min = table[i][j];
				}
			}
		}
		System.out.println("The max element of the array is: " + max);
		System.out.println("The min element of the array is: " + min);
		sc.close();
	}
}
