import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		int number = sc.nextInt();

		int spaces = number - 1;
		int asteriks;
		// filled triangle
		for (int i = 0; i < number; i++) {
			asteriks = (2 * i) + 1;

			for (int j = 0; j <= asteriks + spaces; j++) {
				if (j <= spaces) {
					System.out.print(' ');
				} else {
					System.out.print('*');
				}

			}
			System.out.println();
			spaces--;
		}

		// unfilled triangle
		System.out.println("Now printing the same triangle but unfilled:");

		for (int i = 1; i <= number; i++) {
			
			for (int j = 1; j <= number-i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2*i-1; k++) {
				if (i<number) {
					if (k>1 && k<2*i-1) {
						System.out.print(" ");
					}
					else { 
						System.out.print("*");
					}
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();

		}

		sc.close();
	}
}
