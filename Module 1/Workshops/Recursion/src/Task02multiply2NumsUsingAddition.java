import java.util.Scanner;

public class Task02multiply2NumsUsingAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int numOne;
		int numTwo;
		do {
			System.out.println("enter two nums >= 2:");
			numOne=sc.nextInt();
			numTwo=sc.nextInt();
		} while (numOne<2 || numTwo<2);
		
		 System.out.println(multiply2NumsUsingAdditionRecursive(numOne, numTwo));
		 sc.close();

	}
	static int multiply2NumsUsingAdditionRecursive(int a, int b){
		if (a==0) {
			return 0;
		}
		if (b==0) {
			return 0;
		}
		return (a+multiply2NumsUsingAdditionRecursive(a, b-1));
	}

}
