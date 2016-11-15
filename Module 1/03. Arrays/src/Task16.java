import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 10;
		float[] array = new float[arrayLength];
		int index = 1;
		System.out.println("Fill array with size 10 with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		System.out.println("The entered array is:");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= -0.231f) {
				array[i] = (float) ((index * index) + 41.25f);
			} else {
				array[i] = (float) index * array[i];
			}
			index++;
		}

		System.out.println();
		System.out.println("The result array is:");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		sc.close();

	}

}
