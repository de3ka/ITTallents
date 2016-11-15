import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 7;
		int[] array = new int[arrayLength];
		System.out.println("Fill the array with 7 numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int counter = 0;

		System.out.println("Elements of array divisable by 5 but greater than 5 are:");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 5 == 0 && array[i] > 5) {
				counter++;
				System.out.print(array[i] + " ");
			}

		}
		System.out.println("- " + counter + " number/s");
		sc.close();
	}
}
