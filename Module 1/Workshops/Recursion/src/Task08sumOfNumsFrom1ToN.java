import java.util.Scanner;

public class Task08sumOfNumsFrom1ToN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int sum=0;
		int result=sumNumbersFrom1toN(number, sum);
		System.out.println(result);

	}
	static int sumNumbersFrom1toN(int num, int sum){
		if (num==0) {
			return sum;
		}else {
			sum+=num;
			return sumNumbersFrom1toN(num-1, sum);
		}
		
	}

}
