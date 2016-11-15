import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// working with integers
		System.out.println("Enter two integers: ");
		int firstNum = sc.nextInt();
		int secondNum = sc.nextInt();

		int sum = firstNum + secondNum;
		System.out.println("- the sum of " + firstNum + " and " + secondNum + " is: " + sum);

		int substract = firstNum - secondNum;
		System.out.println("- the substraction of " + firstNum + " and " + secondNum + " is: " + substract);

		int division = firstNum / secondNum;
		System.out.println("- the division of " + firstNum + " and " + secondNum + " is: " + division);

		int modulus = firstNum % secondNum;
		System.out.println("- the modulus of " + firstNum + " and " + secondNum + " is: " + modulus);

		// working with doubles
		System.out.println("Now enter two floating point numbers:");
		double newNum1 = sc.nextDouble();
		double newNum2 = sc.nextDouble();

		double newSum = newNum1 + newNum2;
		System.out.println("- the sum of " + newNum1 + " and " + newNum2 + " is: " + newSum);

		double newSubstract = newNum1 - newNum2;
		System.out.println("- the substraction of " + newNum1 + " and " + newNum2 + " is: " + newSubstract);

		double newDivision = newNum1 / newNum2;
		System.out.println("- the division of " + newNum1 + " and " + newNum2 + " is: " + newDivision);

		double newModulus = newNum1 % newNum2;
		System.out.println("- the modulus of " + newNum1 + " and " + newNum2 + " is: " + newModulus);
		sc.close();

	}

}
