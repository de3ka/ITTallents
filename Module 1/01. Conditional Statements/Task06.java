/*
 * ������ 6:
�������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
�� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
�3 �� ��� ������� �������� �� �1.
 */
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter �1: ");
		int a1 = sc.nextInt();
		System.out.print("Enter �2: ");
		int a2 = sc.nextInt();
		System.out.print("Enter �3: ");
		int a3 = sc.nextInt();

		int temp = a1;
		a1 = a2;
		a2 = a3;
		a3 = temp;
		
		System.out.println("swapped numbers are:");
		System.out.println("a1 = " + a1 + " ; " + "a2 = " + a2 + " ; " + "a3 = " + a3);
		sc.close();

	}
}
