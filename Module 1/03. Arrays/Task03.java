
/*
 * ������ 3:
�� �� ������ �����, ���� ����� �� �� ������� ����� � 10
�������� �� ������� �����:
������� 2 �������� �� ������ �� ���������� �����.
����� ������� ������� �� ������ � ����� �� ����� ��
���������� 2 �������� � ������.
���� ���� �������� ������ .
 */
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for the first 2 indexes of the array:");
		int number = sc.nextInt();
		int arrayLength = 10;

		int[] array = new int[arrayLength];
		array[0] = number;
		array[1] = number;
		for (int i = 2; i < array.length; i++) {
			array[i] = array[i - 1] + array[i - 2];
		}
		System.out.println("The result array looks like:");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i] + "]");
			}

		}
		sc.close();
	}

}
