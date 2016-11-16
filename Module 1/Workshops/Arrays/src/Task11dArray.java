import java.util.Scanner;

public class Task11dArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of rows of the array: ");
		int rows = sc.nextInt();
		System.out.println("Enter size of colums of the array: ");
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];
		
		// printing array4.)
		System.out.println("Printing the result array:");
		int counter = 1;
		for (int j = 0; j < array[0].length; j++) {
			if (j % 2 == 0) {
				for (int i = 0; i < array.length; i++) {
					array[i][j] = counter;
					counter++;
				}
			} else {
				for (int i = array.length - 1; i >= 0; i--) {
					array[i][j] = counter;
					counter++;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}