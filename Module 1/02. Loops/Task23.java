/*
 * ������ 23:
�� �� ������� ��������, ����� ���� ����� while �������
��������� �� ���������, �� ��� ����������.
�.�. ��� � �������� 4*5 �� �� ������� 5*4.
������:
1-�� ���: 1*1; 1*2; 1*3; 1*4; 1*5; 1*6; 1*7; 1*8; 1*9;
2-�� �e�: 2*2; 2*3; 2*4; 2*5; 2*6; 2*7; 2*8; 2*9;
...
9-�� ���: 9*9; 
 */
public class Task23 {

	public static void main(String[] args) {

		  int counterLeft = 1;
          int counterRight = 1;
          while (counterLeft <= 9)
          {
              counterRight = counterLeft;
              while (counterRight <= 9)
              {
                  System.out.print(counterLeft + "*" + counterRight + "; ");
                      counterRight++;
              }
              System.out.println();
              counterLeft++;
          }
      }
  }
