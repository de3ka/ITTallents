import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		int month;
		int year;
		do {
			System.out.print("Enter day [1 to 31]: ");
			day = sc.nextInt();
			System.out.print("Enter month [1 to 12]: ");
			month = sc.nextInt();
			System.out.print("Enter year > 0: ");
			year = sc.nextInt();
		} while (day < 1 || day > 31 || year <= 0 || month < 1 || month > 12);

		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) != 0 && month == 2 && day == 28) {

			day = 1;
			month += 1;
			System.out.println(day + " , " + month + " , " + year);

		} else if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 && month == 2 && day == 28) {

			day += 1;
			System.out.println(day + " , " + month + " , " + year);

		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 && day == 31) {

			day = 1;
			month += 1;
			System.out.println(day + " , " + month + " , " + year);

		} else if (month == 12 && day == 31) {

			year += 1;
			day = 1;
			month = 1;
			System.out.println(day + " , " + month + " , " + year);

		} else if (month == 4 || month == 6 || month == 9 || month == 11 && day == 30) {

			day = 1;
			month += 1;
			System.out.println(day + " , " + month + " , " + year);

		} else {

			month += 1;
			day += 1;
			System.out.println(day + " , " + month + " , " + year);
		}
		sc.close();

	}
}
