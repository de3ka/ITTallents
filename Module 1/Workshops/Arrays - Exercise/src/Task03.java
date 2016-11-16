//import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array:");
		int arrayLength = sc.nextInt();

		int[] firstArray = new int[arrayLength];
		int[] secondArray = new int[firstArray.length];
		System.out.println("Enter array elements:");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i] = sc.nextInt();
		}

		for (int i = 0; i < firstArray.length-2; i++) {
			secondArray[i+1] = firstArray[i] + firstArray[i + 2];
		}
		
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[0]=firstArray[0];
			secondArray[firstArray.length-1]=firstArray[firstArray.length-1];
			System.out.print(secondArray[i]+", ");
		}
		sc.close();
		//System.out.println();
		//System.out.print(Arrays.toString(secondArray));
			
		}

	}
