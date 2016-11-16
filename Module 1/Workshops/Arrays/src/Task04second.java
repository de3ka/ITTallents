import java.util.Scanner;

public class Task04second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];

		System.out.println("Fill array with 0 and 1");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println();

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		sc.close();


	}

}
