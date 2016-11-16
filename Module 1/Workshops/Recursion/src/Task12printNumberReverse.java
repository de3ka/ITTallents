import java.util.Scanner;

public class Task12printNumberReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		reverseNumberRecursive(number);
		sc.close();

	}
	static void reverseNumberRecursive(int num){
		int temp;
		if (num<10) {
			System.out.print(num);
			return;
		}
		if (num!=0) {
			temp=num%10;
			System.out.print(temp);
			reverseNumberRecursive(num/10);
			
		}
	}
}