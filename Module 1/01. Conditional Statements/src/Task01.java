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
