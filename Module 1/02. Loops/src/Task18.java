import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOne;
		int numTwo;
		int multiply=0;
		do {
			System.out.println("Enter two numbers in range [1..9]: ");
			numOne = sc.nextInt();
			numTwo = sc.nextInt();
		} while (numOne < 1 || numOne > 9 || numTwo < 1 || numTwo > 9);
		
		for (int i = 1; i <= numOne; i++) {
			for (int j = 1; j <=numTwo; j++) {
				multiply=i*j;
				System.out.println(i + "*" + j + " = "+ multiply);
			}
		}
		sc.close();

	}

}
