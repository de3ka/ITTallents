
/*
 * ������ 8: �� �������� ����� n, �� �� ������ �� ������ ������� ��
������� �����:
������:
�������� n:
1
0
�������� n:
2
11
33
�������� n:
3
222
444
666
�������� n:
4
3333
5555
7777
9999
 */
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int number = sc.nextInt();
		int pattern=number-1;
		
		for (int row = 1; row <=number; row++) {
			for (int col = 1; col <=number; col++) {
				
				System.out.print(pattern);
			}
			pattern+=2;
			System.out.println();
		}
		sc.close();

	}

}
