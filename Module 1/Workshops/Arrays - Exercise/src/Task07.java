import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		double[] array = new double[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		// get max sum of triplets of numbers int the array
		double currenSum = 0.00;
		double maxSum = 0.00;
		int arrayIndex = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				array[i] *= (-1);
				
			}
			System.out.print(array[i]+", ");
			System.out.println();
		}

		for (int i = 0; i < array.length - 2; i++) {

			currenSum = array[i] + array[i + 1] + array[i + 2];

			if (currenSum > maxSum && array[i] != array[i + 1] && array[i] != array[i + 2]
					&& array[i + 1] != array[i + 2]) {
				maxSum = currenSum;
				arrayIndex = i;

			}
		}
		System.out.println("Max sum is: "+ maxSum);

		for (int i = arrayIndex; i < arrayIndex + 3; i++) {
			if (i != arrayIndex + 3 - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}

	}
}
