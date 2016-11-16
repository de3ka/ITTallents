import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size by rows:");
		int rows = sc.nextInt();
		System.out.println("Enter array size by colums:");
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];
		System.out.println("Fill the array with numbers:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Printing the entered array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		int currentSum = 0;
		int maxSum = 0;
		int indexSquareX = 0;
		int indexSquareY = 0;

		for (int i = 0; i < rows - 1; i++) {
			for (int j = 0; j < cols - 1; j++) {
				for (int i2 = i; i2 < i + 2; i2++) {
					for (int j2 = j; j2 < j + 2; j2++) {
						currentSum += array[i2][j2];
					}
				}
				if (currentSum > maxSum) {
					maxSum = currentSum;
					indexSquareX = j;
					indexSquareY = i;
				}
				currentSum = 0;
			}
		}
		System.out.println("The submatrix with size 2x2 with max sum is:");
		for (int i = indexSquareY; i < indexSquareY + 2; i++) {
			for (int j = indexSquareX; j < indexSquareX + 2; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			sc.close();
		}
	}
}
