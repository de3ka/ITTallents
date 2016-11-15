/*
 * Задача 25:
Да се направи програма, която по дадено число N, да изчислява
N!, т.е. 1*2*3*4...*N.
Пример: 5
Изход: 120
Използвайте цикъл do-while.
 */
import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double number;
		double factorialN=1;
		
		do {
			System.out.println("Please enter a positive number: ");
			number=sc.nextDouble();
		} while (number<0);
		
		do {
			if (number==0) {
				System.out.print("1");
			}else {
				factorialN *= number;
				--number;
			}
		} while (number>0);
		System.out.println(factorialN);
		sc.close();
	}
}
