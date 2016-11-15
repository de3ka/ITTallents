import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum;
		int secondNum;

		do {
			System.out.print("Enter first number [10..99]: ");
			firstNum = sc.nextInt();
			System.out.print("Enter second number [10..99]: ");
			secondNum = sc.nextInt();
		} while (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99);

		int multiply = firstNum * secondNum;
		int lastDigit = multiply % 10;

		if (lastDigit % 2 == 0) {

			System.out.println(multiply + " ; " + lastDigit + " is even.");

		} else {

			System.out.println("result: " + multiply + " ; " + lastDigit + " is odd.");

		}
		sc.close();

	}
}
