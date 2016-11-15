
/*
 * Задача 17:
Една редица от естествени числа ще наричаме зигзагообразна нагоре,
ако за елементите и са изпълняват условията:
N1 < N2 > N3 < N4 > N5 <..
Съставете програма, която проверява дали въведени в едномерен
масив редица от числа изпълняват горните изисквания.
Пример: 1 3 2 4 3 7
Изход: изпълнява изискванията за зигзагообразна нагоре редица
 */
import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		int[] array = new int[arrayLength];
		System.out.println("Fill array with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		boolean flag = true;
		for (int i = 1; i < array.length - 1; i++) {
			if (!((array[i] < array[i - 1] && array[i] < array[i + 1])
					|| (array[i] > array[i - 1] && array[i] > array[i + 1]))) {
				flag = false;
				break;
			}
		}
		System.out.println(flag ? "The array is jagged." : "The array is not jagged.");
		sc.close();
	}

}
