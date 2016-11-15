import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int squareSide;
		char symbol;
		do {
			System.out.println("Please enter square's side in the interval [3..20]: ");
			squareSide = sc.nextInt();
			symbol = sc.next().charAt(0);
		} while (squareSide < 3 || squareSide > 20);

		for (int i = 1; i <= squareSide; i++) {
			for (int j = 1; j <= squareSide; j++) {
				if (i == 1 || i == squareSide || j == 1 || j == squareSide) {
					System.out.print('*');
				} else {
					System.out.print(symbol);
				}
			}
			System.out.println();
		}
		sc.close();

	}

}
