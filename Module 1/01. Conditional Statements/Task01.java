/*
 * Задача 1:
Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double).
После да се прочете 3-то число C и да се провери дали то е м/у A и B.
Да се изведе подходящо съобщение за това дали C е между A и B.
 */

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		double firstNum = sc.nextDouble();

		System.out.print("Enter second number: ");
		double secondNum = sc.nextDouble();

		System.out.print("Enter third number: ");
		double thirdNum = sc.nextDouble();

		if ((firstNum < thirdNum) && (thirdNum < secondNum)) {
			
			System.out.println(thirdNum + " is between " + firstNum + " and " + secondNum);
			
		} else if ((secondNum < thirdNum) && (thirdNum < firstNum)) {
			
			System.out.println(thirdNum + " is between " + secondNum + " and " + firstNum);
			
		} else if ((firstNum <= thirdNum) && (thirdNum >= secondNum)) {
			
			System.out.println(thirdNum + " is not between " + secondNum + " and " + firstNum);
			
		} else {
			
			System.out.println(thirdNum + " is not between " + firstNum + " and " + secondNum);
			
		}
		sc.close();
	}

}
