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
