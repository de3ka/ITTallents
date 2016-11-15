import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Please enter first number: ");
		int numberOne = sc.nextInt();
		System.out.print("Please enter second number: ");
		int numberTwo = sc.nextInt();
		
		if (numberOne == numberTwo) {
			System.out.println("Tne numbers from " + numberOne + " to " + numberTwo + " are: ");
			System.out.println(numberOne);
		} else if (numberOne > numberTwo) {
			System.out.println("Tne numbers from " + numberTwo + " to " + numberOne + " are: ");
			for (int i = numberTwo; i <= numberOne; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Tne numbers from " + numberOne + " to " + numberTwo + " are:");
			for (int i = numberOne; i <= numberTwo; i++) {
				System.out.println(i);
			}

		}
		sc.close();

	}

}
