import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int tmp1=number;
		
		int temp=number;
		int digitsCount=0;
		
		do {
			temp=temp/2;
			digitsCount++;
			
		} while (temp!=0);
		
		if (digitsCount==0) {
			digitsCount=1;
		}
		
		int digit=0;
		
		int[] array=new int[digitsCount];
		for (int i = array.length-1; i >=0 ; i--) {
			digit=number%2;
			array[i]=digit;
			number/=2;
			
		}
		System.out.println("The binary representation of the number " + tmp1 +" is:");
		for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+"");
			}
		sc.close();
		}

	}

