import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter array size:");
		int size = sc.nextInt();
		int[] arrayPrint = new int[size];
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < arrayPrint.length; i++) {
			arrayPrint[i] = sc.nextInt();
		}
		System.out.println("The entered array looks like this:");
		printArray(arrayPrint);
		sc.close();
	}

	static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.println(array[i] + "]");
			}
		}

	}

}
