import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		int tempCounter = 1;
		int counter = 0;
		int index = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					tempCounter++;
				}
			}
			if (tempCounter > counter) {
				counter = tempCounter;
				index = i;
			}
			tempCounter = 0;

		}
		System.out.println(array[index] + " (" + counter + " times)");
		sc.close();
	}

}
