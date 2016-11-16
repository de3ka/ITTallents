import java.util.Scanner;

public class Task11bArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array by rows:");
		int rows = sc.nextInt();
		System.out.println("Enter size of array by colums:");
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];

		// printing array 2).
		int counter = 1;
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				array[i][j] = counter;
				counter++;
			}
		}
		// printing the result array:
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		sc.close();
	}

}
