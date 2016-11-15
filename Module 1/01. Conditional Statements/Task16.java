
/*
 * ������ 16:
�������� � ���������� ���������� ����� �� ���� abc.
������ �� �� ������� ����:
��� a = b = c - �����: ������� �� �����;
��� a>b>c - �����: ������� �� ��� �������� ���;
��� a<b<c ������� �� � �������� ���;
� �����: ������� �� ����������, �� ����������� ������.
�� �� ������� ��������, ����� ������� ��������� �� ���������� ��
������� �� ������� � �������.
������: 345
�����: �������� ���.
 */
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter 3 digit number: ");
			number = sc.nextInt();
		} while (number < 100 || number > 999);

		int firstDigit = number % 10;
		number /= 10;
		int secondDigit = number % 10;
		number /= 10;
		int thirdDigit = number % 10;

		if (firstDigit == secondDigit && secondDigit == thirdDigit) {

			System.out.println("All digits are equal.");

		} else if (secondDigit > thirdDigit && secondDigit < firstDigit) {

			System.out.println("The digits are in increasing order.");

		} else if (thirdDigit > secondDigit && secondDigit > firstDigit) {

			System.out.println("The digits are in decreasing order.");

		} else {

			System.out.println("The digits are misplaced.");

		}
		sc.close();

	}

}
