
/*
 * ������ 22:
�� �� ������� ��������, ����� ������� ������� 10 ���-�����
�����, ����� �� ����� �� 2, 3 ��� �� 5 � ����� �� ��-������ ��
�������� ���������� �����.
������� �� ��������, ������ � ������ ������� �����.
������ �����: ����� �� ��������� [1..999]
������: 1
�����: 1:2; 2:3, 3:4, 4:5, 5:6, 6:8, 7:9, 8:10, 9:12, 10:14
����������� ����� while.
 */
import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;

		do {
			System.out.println("Please enter a number in the interval [1..999]: ");
			number = sc.nextInt();
		} while (number < 1 || number > 999);

		int count = 1;

		while (count <= 10) {

			if (number % 2 == 0) {
				System.out.print(count + ":");
				System.out.print(number + ", ");
				count++;
			} else if (number % 3 == 0) {
				System.out.print(count + ":");
				System.out.print(number + ", ");
				count++;
			} else if (number % 5 == 0) {
				System.out.print(count + ":");
				System.out.print(number + ", ");
				count++;
			}
			number++;
		}
		System.out.println();
		sc.close();
	}
}
