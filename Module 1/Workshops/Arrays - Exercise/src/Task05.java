import java.util.Arrays;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];

		int average = 0;
		int sumOfElements = 0;
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Original array is: ");
		System.out.println(Arrays.toString(array));
		
		//namirane na sumata na wsi4ki elem i tqhnoto srednoaritmeti4no
		for (int i = 0; i < array.length; i++) {
			sumOfElements += array[i];
			average = sumOfElements / array.length;
		}

		System.out.println("Average = " + average);

		int[] substractions = new int[array.length];
		System.out.println("Array of substractions is: ");
		for (int i = 0; i < substractions.length; i++) {
			int substract = array[i] - average;
			if (substract < 0) {
				substract = substract * (-1);
			}
			substractions[i] = substract;
			if (i == substractions.length - 1) {
				System.out.print(substractions[i]);
			} else {
				System.out.print(substractions[i] + ", ");
			}
		}
		System.out.println();

		// tyrsene na min element v masiva substractions
		double min = array[0];
		int minIndex = 0;
		for (int i = 1; i < substractions.length; i++) {
			if (substractions[i] < min) {
				min = substractions[i];
				minIndex = i; // zapiswane na indeksa na min element
			}
		}
		System.out.print("Element closest to average is: ");
		System.out.print(array[minIndex]);// otpe4atvane na indeksa ot whodniqt
											// masiv=indeksa na min element ot
											// masiva substractions

	}

}
