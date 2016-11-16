/*
 * Да се напише програма която изисква от потребителя да въведе
2 числа n и m. След това да се построи матрица с размер n x m по
следният начин (примерите са дадени за въведени n=4 и m=5):
1).
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
4).
1 8 9 16 17
2 7 10 15 18
3 6 11 14 19
4 5 12 13 20
*/
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