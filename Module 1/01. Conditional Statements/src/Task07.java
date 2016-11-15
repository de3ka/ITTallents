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
