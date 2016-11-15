import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		double[] array = new double[arrayLength];
		// double[] secondArray=new double[3];

		System.out.println("Fill array with numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}

		double temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < 0) {
					array[j] = array[j] * (-1);
				}
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + ", ");
		}

	}
}
