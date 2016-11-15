import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 7;
		int[] array = new int[arrayLength];
		System.out.println("Fill array with size 7 with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		// swap using temp value
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
		// swap using addition method
		array[2] = array[2] + array[3];
		array[3] = array[2] - array[3];
		array[2] = array[2] - array[3];
		// swap using multiply method
		array[4] = array[4] * array[5];
		array[5] = array[4] / array[5];
		array[4] = array[4] / array[5];
		
		System.out.println("Printing the result swapped array:");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != arrayLength - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]+"]");
			}
		}
		sc.close();

	}

}
