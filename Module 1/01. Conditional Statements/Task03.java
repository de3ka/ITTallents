/*
 * Задача 3:
Въведете 2 различни числа от конзолата и разменете стойността им.
Разпечатайте новите стойности
 */

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Enter second number: ");
		int secondNum = sc.nextInt();

		int temp = firstNum;
		firstNum = secondNum;
		secondNum = temp;
		
		System.out.print("Switched numbers are: ");
		System.out.println("first number=" + firstNum + " , second number=" + secondNum);
		sc.close();
	}

}
