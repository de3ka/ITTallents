import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		System.out.println("Enter array elements:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int currentMaxSequence = 0;   // broq4, sledqsht povtoreniqta
		int longestSequence = 0;     // maksimalniqt broi na broq4a ,dostignat pri
									// povtoreniqta
		int arrayIndex = 0;        //tekushtiqt indeks w masiva

		for (int i = 0; i < array.length; i++) {
			currentMaxSequence=0;
			int j=i;
			while(array[i] == array[j]) {
				currentMaxSequence++;
				j++;
				if (j >= array.length) {
					break;
				}
			} if (currentMaxSequence > longestSequence) {
					longestSequence = currentMaxSequence;
					arrayIndex = i;
				}
			}

		for (int i = arrayIndex; i < arrayIndex + longestSequence; i++) {
			if (i != arrayIndex + longestSequence-1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
	}
}
