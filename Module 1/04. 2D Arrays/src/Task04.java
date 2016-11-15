import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ot rows of the array:");
		int rows = sc.nextInt();
		System.out.println("Enter size of colums of the array:");
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];
		
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		// print the entered array
		System.out.println("Printing the entered array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// flip array to +90 degrees
		int[][] rotated = new int[rows][cols];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				rotated[i][j] = array[array[i].length - j - 1][i];
			}
		}
		
		// print the rotated array
		System.out.println("Printig the rotated array:");
		for (int i = 0; i < rotated.length; i++) {
			for (int j = 0; j < rotated[i].length; j++) {
				System.out.print(rotated[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
