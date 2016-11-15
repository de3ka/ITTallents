import java.util.Scanner;

public class Task18 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first and second array size:");
		int firstArrayLength=sc.nextInt();
		int[] firstArray=new int[firstArrayLength];
		
		System.out.println("Fill first array with numbers:");
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i]=sc.nextInt();
			
		}

		int[] secondArray=new int[firstArray.length];
		System.out.println("Fill second array with numbers:");
		for (int i = 0; i < secondArray.length; i++) {
			secondArray[i]=sc.nextInt();
		}
		int[] thirdArray=new int[firstArray.length];
		for (int i = 0; i < firstArray.length; i++) {
			if (firstArray[i]>secondArray[i]) {
				thirdArray[i]=firstArray[i];
			}
			else if (firstArray[i]<secondArray[i]) {
				thirdArray[i]=secondArray[i];
			}
			else {
				thirdArray[i]=firstArray[i];
			}
		}
		System.out.println("The first array is:");
		for (int i = 0; i < firstArray.length; i++) {
			if (i!=firstArray.length-1) {
				System.out.print(firstArray[i]+ ", ");
			}
			else {
				System.out.print(firstArray[i]);
			}
		}
		System.out.println();
		System.out.println("The second array is:");
		for (int i = 0; i < secondArray.length; i++) {
			if (i!=secondArray.length-1) {
				System.out.print(secondArray[i]+ ", ");
			}
			else {
				System.out.print(secondArray[i]);
			}
		}
		System.out.println();
		System.out.println("The result array, generated after the comparison between the first and the second array, is:");
		for (int i = 0; i < thirdArray.length; i++) {
			if (i!=thirdArray.length-1) {
				System.out.print(thirdArray[i]+ ", ");
			}
			else {
				System.out.print(thirdArray[i]);
			}
		}
		sc.close();

	}

}
