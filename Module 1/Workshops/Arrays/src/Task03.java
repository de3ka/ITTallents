import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		System.out.println("Enter a char:");
		char symbol = sc.next().charAt(0);
		char[] array = new char[arrayLength];

		System.out.println("Fill array with symbols:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.next().charAt(0);
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == symbol && flag==true) {
				System.out.println("The entered char is in position " + i + " in the array.");
				
			} else{
				System.out.println("Printing randomly picked position in the array - " + i);
				break;
			}
		}
		sc.close();

	}

}
