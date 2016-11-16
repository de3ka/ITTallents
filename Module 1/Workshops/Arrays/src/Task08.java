import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter matrix size by rows and colums(rows=colums):");
		int rows = sc.nextInt();
		int cols = rows;
		boolean check = false;
		boolean[][] matrix = new boolean[rows][cols];
		// fill matrix with true and false
		System.out.println("Fill matrix with boolean values:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextBoolean();
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
		System.out.println("Is the a true value above the secondary diagonal? ");
		// checking if there is true value above the secondary diagonal
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (((i + j) < matrix.length - 1) && (matrix[i][j] == true)) {
					check = true;
					break;
				}
			}
		}
		System.out.println(check ? "Yes." : "No.");
		sc.close();
	}

}
