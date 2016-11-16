import java.util.Arrays;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arrayLength=sc.nextInt();
		int[]array=new int[arrayLength];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("The input array is: ");
		System.out.println(Arrays.toString(array));
		
		
		System.out.println("Elements of array divisable by 5 but greater than 5 are:");
		for (int i = 0; i < array.length; i++) {
			if (array[i]%5==0 && array[i]>5) {
				System.out.print(array[i]+" ");
			}
			
		}

	}

}
