import java.util.Scanner;

public class Task13FindMinElemAndMinIndexInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int startIndex = 0;
		int minElemOfArray = 0;
		minElemOfArray = indexOfMinElementRecirsion(array, startIndex);

		System.out.println("The index of the min elem of the array is - " + minElemOfArray);
		System.out.println("The value of the min element of the array is - " + array[minElemOfArray]);

	}

	// find the min element in array recursively
	static int indexOfMinElementRecirsion(int[] arr, int index) {
		if (index == arr.length - 1) {
			return index;
		}
		int minElem = indexOfMinElementRecirsion(arr, index + 1);
		if (arr[index] < arr[minElem]) {
			return index;
		} else {
			return minElem;
		}
	}

}
