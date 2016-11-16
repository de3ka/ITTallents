import java.util.Scanner;

public class Task14CheckifArrayIsMonotoneIncreasing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		if (monotoneSequenceRecusive(array, array.length - 1)) {
			System.out.println("The sequence is monotonically increasing");
		} else {
			System.out.println("The sequence is not monotonically increasing ");
		}

	}

	// recursively determine whether array indexes are monotonously uprising
	static boolean monotoneSequenceRecusive(int array[], int index) {
		if (index == 0) {
			return true;
		}
		if (array[index] - array[index - 1] >= 0) {
			return monotoneSequenceRecusive(array, index - 1);
		} else {
			return false;
		}

	}
}
