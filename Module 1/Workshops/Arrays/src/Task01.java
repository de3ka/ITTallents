import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		boolean flag = true;
		System.out.println("Fill array with numbers:");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length; i++) {
			if (!(array[i] >= 0)) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "All array elements are positive." : "Not all array elements are positive.");
		sc.close();
	}

}
