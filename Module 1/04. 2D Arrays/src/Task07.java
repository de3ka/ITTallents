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
