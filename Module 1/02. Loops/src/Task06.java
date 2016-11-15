import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.print("Please enter a number different from 1: ");
			num = sc.nextInt();
		} while (num == 1);

		int sum = 0;

		// if number is bigger than 1
		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				sum = sum + i;
			}
			System.out.println("The sum of the numbers between 1 and " + num + " is: " + sum);
		}

		// if number is smaller than 1
		else if (num < 1) {
			for (int i = num; i <= 1; i++) {
				sum = sum + i;
			}
			System.out.println("The sum of the numbers between " + num + " and 1 is: " + sum);
		}
		sc.close();
	}
}
