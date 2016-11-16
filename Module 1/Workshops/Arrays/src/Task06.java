import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array's size by rows:");
		int rows=sc.nextInt();
		System.out.println("Enter array's size by colums:");
		int cols=rows;
		char[][] array=new char[rows][cols];
		System.out.println("Filling the array with symbols:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j]=sc.next().charAt(0);
			}
		}
		//printing the array
		System.out.println("The entered array looks like this:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		//printing the symbols of the main diagonal
		System.out.println("The symbols on the main diagonal are:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (i==j) {
					System.out.print(array[i][j]+" ");
				}
			}
		}
		sc.close();

	}

}
