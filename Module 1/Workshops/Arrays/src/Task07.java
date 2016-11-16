import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size by rows and colums:");
		int rows = sc.nextInt();
		int cols = rows;
		int[][] matrix = new int[rows][cols];
		System.out.println("Fill matrix with numbers:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		// printing the matrix
		System.out.println("The enetered matrix looks like this:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		// finding the multiplication of elements below main diagonal of matrix
		int multiply = 1;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i > j) {
					multiply *= matrix[i][j];
				}
			}
		}
		System.out.println("The multiplication of elements below main diagonal of matrix is: " + multiply);
		sc.close();
	}

}
