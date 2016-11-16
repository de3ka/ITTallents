import java.util.Scanner;

public class Task06sumOfDigitsInNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number;
		do {
			number=sc.nextInt();
		} while (number<10 || number>10010);
		int sumDigits=0;
		int result=digitsSumRecursive(number, sumDigits);
		System.out.println(result);
		sc.close();

	}
	static int digitsSumRecursive(int num, int sum){
		if (num==0) {
			return sum;
		}else {
			int tmp=0;
			tmp=num%10;
			sum+=tmp;
			return digitsSumRecursive(num/10, sum);
		}
	} 

}
