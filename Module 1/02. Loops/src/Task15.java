import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int sum=0;
		int count=1;
		
		do {
			sum+=count;
			count++;
		} while (count<=number );
		
		System.out.println("The sum of numbers between 1 and " + number + " is:");
		System.out.println(sum);
		sc.close();
	}

}
