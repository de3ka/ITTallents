import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		do {
			System.out.println("Please enter n and m in the interval [10..5555]: ");
			n = sc.nextInt();
			m = sc.nextInt();
		} while ((n < 10 || n > 5555) || (m < 10 || m > 5555));

		
		if (n < m) {
			System.out.print("Numbers divisable by 50 in the interval " + n + " to " + m + " are: ");
			for (int i = m; i >= n; i--) {
				if (i % 50 != 0) {
					continue;
				} else {
					System.out.print(i + ", ");
				}
			}
		} else if (n > m) {
			System.out.print("Numbers divisable to 50 in the interval " + m + " to " + n + " are: ");
			for (int i = n; i >= m; i--) {
				if (i % 50 != 0) {
					continue;
				} else {
					System.out.print(i + ", ");
				}
			}
		} else {
			if (n % 50 == 0 || m % 50 == 0) {
				System.out.print(n);
			}
		}
		sc.close();
	}
}
