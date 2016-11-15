/*
 * Задача 10:
Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
3 литра и ги ползвате едновременно.
Да се състави програма, която по даден обем извежда как ще прелеете
течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
кофите. Кофите не могат да се ползват с частично количество вода.
Входни данни: естествено число от интервала [10..9999].
Пример: 107
Изход: 21 пъти по 2 литра,
21 пъти по 3 литра
допълнително кофа от 2 литра
 */
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int waterAmount;
		do {
			System.out.print("Enter amount of water [10..9999]: ");
			waterAmount = sc.nextInt();
		} while (waterAmount<10 || waterAmount>9999);
		

		int firstBucket = 2;
		int secondBucket = 3;

		int filledBuckets = waterAmount / (firstBucket + secondBucket);
		int remainingWater = waterAmount % (firstBucket + secondBucket);

		if (remainingWater == 2) {

			System.out.println(filledBuckets + " times 2 liter buckets.");
			System.out.println(filledBuckets + " times 3 liter buckets.");
			System.out.println("One additional 2 liter bucket.");

		} else if (remainingWater == 3) {

			System.out.println(filledBuckets + " times 2 liter buckets.");
			System.out.println(filledBuckets + " times 3 liter buckets.");
			System.out.println("One additional 3 liter bucket.");

		} else if (remainingWater == 4) {

			System.out.println(filledBuckets + " times 2 liter buckets.");
			System.out.println(filledBuckets + " times 3 liter buckets.");
			System.out.println("Two additional 2 liter buckets.");

		} else if (remainingWater == 1) {

			filledBuckets = filledBuckets - 1;
			System.out.println(filledBuckets + " times 2 liter buckets.");
			System.out.println(filledBuckets + " times 3 liter buckets.");
			System.out.println("Two additional 3 liter buckets.");

		} else {

			System.out.println(filledBuckets + " times 2 liter buckets.");
			System.out.println(filledBuckets + " times 3 liter buckets.");
			System.out.println();

		}
		sc.close();

	}
}
