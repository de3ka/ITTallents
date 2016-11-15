
/*
 * Задача 5:
Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ
ред.
 */

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		int a = sc.nextInt();
		System.out.print("Enter second number: ");
		int b = sc.nextInt();
		System.out.print("Enter third number: ");
		int c = sc.nextInt();

		if (a == b && a == c) {
			System.out.println("The numbers are equal. No decreasing sequence.");
			System.out.println(a + ", " + b + ", " + c);
		} else {
			System.out.println("Decreasing sequence is:");
			if (a > b && a > c)
				if (b > c) {
					System.out.println(a + ", " + b + ", " + c);
				} else if (b < c) {
					System.out.println(a + ", " + c + ", " + b);
				} else if (b == c) {
					System.out.println(a + ", " + c + ", " + b);
				}
			if (b > a && b > c)
				if (a > c) {
					System.out.println(b + ", " + a + ", " + c);
				} else if (c > a) {
					System.out.println(b + ", " + c + ", " + a);
				} else if (c == a) {
					System.out.println(b + ", " + c + ", " + a);
				}
			if (c > a && c > b)
				if (a > b) {
					System.out.println(c + ", " + a + ", " + b);
				} else if (b > a) {
					System.out.println(c + ", " + b + ", " + a);
				} else if (b == a) {
					System.out.println(c + ", " + b + ", " + a);
				}
		}

		sc.close();
	}
}
