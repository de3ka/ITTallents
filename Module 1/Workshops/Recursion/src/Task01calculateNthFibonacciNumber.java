import java.util.Scanner;

public class Task01calculateNthFibonacciNumber {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int num=sc.nextInt();
		 System.out.println("The N-th fibonacci number is:");
		 System.out.println(fibonacciRecursive(num));
		 sc.close();

	}
	static int fibonacciRecursive(int number){
		if (number==1) {
			return 1;
		}
		if (number==2) {
			return 1;
		}
		return fibonacciRecursive(number-1)+fibonacciRecursive(number-2);
	}

}
