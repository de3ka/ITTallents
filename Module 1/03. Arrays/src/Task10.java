import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 7;
		int[] array = new int[arrayLength];

		double average = 0.0;
		int sumOfElements = 0;
		System.out.println("Fill the array with 7 numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		//finding namirane na sumata na wsi4ki elem i tqhnoto srednoaritmeti4no
		for (int i = 0; i < array.length; i++) {
			sumOfElements += array[i];
			average = sumOfElements / array.length;
		}

		System.out.println("Average = " + average);

		int[] substractions = new int[array.length];

		for (int i = 0; i < substractions.length; i++) {
			double substract = array[i] - average;
			if (substract < 0) {
				substract = substract * (-1);
			}
			substractions[i] = (int) substract;
		}

		//searching for min elem in substractions array
		double min = substractions[0];
		int minIndex=0;
		for (int i = 0; i < substractions.length; i++) {
			if (min>substractions[i]) {
				min = substractions[i];
				minIndex = i; 
			}
		}
		System.out.print("Element of array closest to average is: ");
		System.out.print(array[minIndex]);
		sc.close();

	}

}
