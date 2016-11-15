
/*
 * Задача 9: Да се прочетат 2 числа от клавиатурата А и В.
Да се изведат всички числа от А до В на степен 2(разделени с
запетая).Ако някое число е кратно на 3, да се изведе съобщение че
числото се пропуска „skip 3“.Ако сумата от всички изведени числа (без
пропуснатите) стане по-голяма от 200, да се прекрати извеждането.
 */
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numberOne = sc.nextInt();
		System.out.print("Enter second number: ");
		int numberTwo = sc.nextInt();
		int sum = 0;
		int square = 0;
		
		if (numberOne<=numberTwo) {
			
			for (int i = numberOne; i <= numberTwo; i++) {
				square = i * i;

				if (square % 3 != 0) {
					sum += square;
					if (sum <= 200) {
						System.out.print(square + ", ");
						//System.out.print("sum=" + sum + "; ");
					} else if(sum>200){
						break;
					}
				} else if (square % 3 == 0) {
					System.out.print("skip3" + ", ");
					continue;
				}

			}
		}
		else {

			for (int i = numberOne; i >=numberTwo ; i--) {
				square = i * i;

				if (square % 3 != 0) {
					sum += square;
					if (sum <= 200) {
						System.out.print(square + ", ");
						//System.out.print("sum=" + sum + "; ");
					} else if(sum>200){
						break;
					}
				} else if (square % 3 == 0) {
					System.out.print("skip3" + ", ");
					continue;
				}

			}
		}
		sc.close();
	}
}
