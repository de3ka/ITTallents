import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size by rows:");
		int rows=sc.nextInt();
		System.out.println("Enter array size by colums:");
		int cols=sc.nextInt();
		int[][] array=new int[rows][cols];
		System.out.println("Fill array with 0 and 1");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		//sorting array in increasing order
		int temp=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int j2 = 0; j2 < array.length; j2++) {
					for (int k = 0; k < array[i].length; k++) {
						if (array[j2][k] > array[i][j]) {
							temp = array[i][j];
							array[i][j] = array[j2][k];
							array[j2][k] = temp;
						}
					}
				}
			}
		}
		System.out.println("The sorted array looks like:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();

	}

}
