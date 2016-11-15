import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		boolean flag = true;
		for (int i = 1; i < array.length - 1; i++) {
			if (!((array[i] < array[i - 1] && array[i] < array[i + 1])
					|| (array[i] > array[i - 1] && array[i] > array[i + 1]))) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "The array is jagged." : "The array is not jagged.");
		sc.close();
	}

}
