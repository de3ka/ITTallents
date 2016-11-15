import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter array size: ");
		int arrayLenght = sc.nextInt();
		int[] array = new int[arrayLenght];
		boolean flag = true;

		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int i = 0, j = array.length - 1; i <= j; i++, j--) {
			if (array[i] != array[j]) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "The array is mirrored." : "The array is not mirrored.");
		sc.close();

	}
}
