import java.util.Arrays;
import java.util.Scanner;

public class Task09ArrayInReverseOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arraySize = sc.nextInt();
		// making an int array
		int[] array = new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
			printReverseArrayRecursive(array);
			System.out.println(Arrays.toString(array));
			sc.close();
	}
	
//print array method
	static void printReverseArrayRecursive(int[] arr){
		reverseArrayRecursive(arr, 0, arr.length-1);
	}

//recursively swap values in array
	static void reverseArrayRecursive(int[] arr, int index, int endIndex) {
		if (index < endIndex) {// Swap
			int tmp = arr[index];
			arr[index] = arr[endIndex];
			arr[endIndex] = tmp;
			reverseArrayRecursive(arr, ++index, --endIndex);
		}

	}
}
