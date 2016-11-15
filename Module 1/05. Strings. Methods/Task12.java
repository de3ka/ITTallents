/*
 * ������ 12:
�� �� ������� �����, ����� ������ �� ������ ����� ����� N �
����� ����� �� ����� � ������� N, ����� ������� ������ �����
�� 1 �� N.
 */
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array N:");
		int num = sc.nextInt();
		int[] array = �ne�oN(num);
		System.out.println("The array from 1 to N looks like this:");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i!=array.length-1) {
				System.out.print(array[i]+", ");
			}else {
				System.out.print(array[i]+"]");
			}
			
		}
		sc.close();

	}

	static int[] �ne�oN(int number) {
		int[] arr = new int[number];
		arr[0] = 1;
		int tmp = 1;
		for (int i = 0; i < number; i++) {
			arr[i] = i + tmp;
		}
		return arr;
	}

}
