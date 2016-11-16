import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length:");
		int arrayLength=sc.nextInt();
		int[] array=new int[arrayLength];
		
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		int[] resultArray=new int[array.length];
		for (int i = 0; i < array.length/2; i++) {
			resultArray[i]=array[i];
			
		}
		int arrayIndex=array.length/2;
		System.out.println(arrayIndex);
		System.out.println();
		for (int i = array.length-1; i >= array.length/2; i--) {
			resultArray[arrayIndex]=array[i];
			arrayIndex++;
		}
		for (int i = 0; i < resultArray.length; i++) {
			if (i==resultArray.length-1) {
				System.out.print(resultArray[i]);
			}
			else {
				System.out.print(resultArray[i]+ ", ");
			}
		}
		sc.close();
		
	}

}
