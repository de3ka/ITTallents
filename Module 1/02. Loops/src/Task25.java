import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double number;
		double factorialN=1;
		
		do {
			System.out.println("Please enter a positive number: ");
			number=sc.nextDouble();
		} while (number<0);
		
		do {
			if (number==0) {
				System.out.print("1");
			}else {
				factorialN *= number;
				--number;
			}
		} while (number>0);
		System.out.println(factorialN);
		sc.close();
	}
}
