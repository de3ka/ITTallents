/*
 * Задача 4:
Въведете 2 различни числа от конзолата и ги разпечатайте в
нарастващ ред.
 */

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int firstNum = sc.nextInt();
		System.out.print("Enter second number: ");
		int secondNum = sc.nextInt();
		
		if (firstNum > secondNum) {
			
			System.out.println("increasing sequence is:");
			System.out.println(secondNum + ", " + firstNum);
			
		} else if(firstNum < secondNum)  {
			
			System.out.println("increasing sequence is:");
			System.out.println(firstNum + ", " + secondNum);
			
		}
		else {
			System.out.println("The numbers are equal. No increasing sequence:");
			System.out.println(firstNum+", "+secondNum);
		}
		sc.close();
	}

}