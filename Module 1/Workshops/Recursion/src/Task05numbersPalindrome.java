import java.util.Scanner;

public class Task05numbersPalindrome {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int number=sc.nextInt();
			int sumDigits=0;
			int result=digitsReverseRecursive(number, sumDigits);
			System.out.println(result);
			if (result==number) {
				System.out.println("palindrome.");
			}else {
				System.out.println("not a palindrome.");
			}
			sc.close();
		}
		static int digitsReverseRecursive(int num, int sum){
			if (num==0) {
				return sum;
			}else {
				int tmp=0;
				tmp=num%10;
				sum=sum*10+tmp;
				return digitsReverseRecursive((num-1)/10, sum);
			}
		} 


}
