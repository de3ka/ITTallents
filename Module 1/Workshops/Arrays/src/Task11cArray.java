import java.util.Scanner;

public class Task11cArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array size by rows:");
		int rows=sc.nextInt();
		System.out.println("Enter array size by colums:");
		int cols=sc.nextInt();
		int[][] array=new int[rows][cols];
		
		int counter=1;
		//printing array 3).
		for (int i = 0; i < rows; i++) {
			int temp=i;
			int j=0;
			while (temp>=0 && j<cols) {
				array[temp--][j++] = counter++;
			}
		}
		for (int i = 1; i < cols; i++) {
			int rowI=rows-1;
			int colsI=i;
			while (rowI>=0 && colsI<cols) {
				array[rowI--][colsI++]=counter++;
				
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
