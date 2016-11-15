/*
 * Задача 14:
Да се състави метод, който приема за стойност число N и връща
стойността на N! (N факториел).
 */
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.println("Enter a positive number to calculate it's factorial");
			number = sc.nextInt();
		} while (number < 0);
		double fact = calculateFactorial(number);
		System.out.println("Factorial is: "+ fact);
		sc.close();
	}

	static double calculateFactorial(int number) {
		double factorial = 1;
		for (int i = 1; i <= number; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

}
