import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];

		System.out.println("Fill array with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0; i < (array.length + 1) / 2; i++) {
			array[i] = i + 1;
			array[array.length - i - 1] = i + 1;
		}

		System.out.println("The new symmetrical array is:");
		System.out.print("[");
		for (int j = 0; j < array.length; j++) {
			if (j != array.length - 1) {
				System.out.print(array[j] + ", ");
			} else {
				System.out.print(array[j] + "]");
			}

		}
		sc.close();

	}
}