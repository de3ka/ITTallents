/*
 * Задача 7:
Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
пари (число с плаваща запетая), дали съм здрав – булев тип.
Съставете програма, която взема решения на базата на тези данни по
следния начин:
- ако съм болен, няма да излизам
- ако имам пари, ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав, ще отида на кино с приятели
- ако имам по-малко от 10 лв, ще отида на кафе.
Полученото решение покажете като съобщение в конзолата.
 */
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		System.out.print("Enter amount of money: ");
		double amountOfMoney = sc.nextDouble();
		System.out.print("Enter whether you are healthy or not: ");
		boolean amIHealthy = sc.nextBoolean();

		if (amIHealthy != true) {
			
			System.out.println("I am ill so I won't be going out.");
		}
		if (amIHealthy != true && amountOfMoney > 0.0) {
			
			System.out.println("I have money, so I'm buying drugs.");
			
		} else if (amIHealthy != true && amountOfMoney == 0.0) {
			
			System.out.println("I don't have enough money for drugs, so I'm staying home and drinking tea.");
			
		}
		if (amIHealthy == true && amountOfMoney >= 10.0) {
			
			System.out.println("I am healty and I'm going to the cinema with friends.");
			
		} else if (amIHealthy == true && amountOfMoney < 10.0) {
			
			System.out.println("I have less than 10 lev, so I'm going to the caffe.");
			
		}
		sc.close();

	}
}
