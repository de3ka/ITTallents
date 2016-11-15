import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temperature;
		do {
			System.out.print("Enter temperature [-100..100]: ");
			temperature = sc.nextInt();
		} while (temperature < -100 || temperature > 100);

		if (temperature < -20) {

			System.out.println("Freezing cold.");

		} else if (temperature >= -20 && temperature <= 0) {

			System.out.println("Cold.");

		} else if (temperature > 0 && temperature <= 15) {

			System.out.println("Chilly.");

		} else if (temperature > 15 && temperature <= 25) {

			System.out.println("Warm.");

		} else if (temperature > 25) {

			System.out.println("Hot.");

		}
		sc.close();

	}
}
