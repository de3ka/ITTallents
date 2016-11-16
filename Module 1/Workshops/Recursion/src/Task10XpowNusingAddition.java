import java.util.Scanner;

public class Task10XpowNusingAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int result=powRecursive(number, 2);
		System.out.println(result);

	}
	//recursion of multiplication of numbers
	static int multiplyUsingAdditionRecursion(int num1, int num2){
		if (num1==0) {
			return 0;
		}
		if (num2==0) {
			return 0;
		}
		return num1+multiplyUsingAdditionRecursion(num1, num2-1);
	}
	//recursion of number m to power n
	static int powRecursive(int number, int pow){
		if (pow==0) {
			return 1;
		}
		if (number==0) {
			return number;
		}
		return multiplyUsingAdditionRecursion(powRecursive(number, pow-1), number);
	}

}
