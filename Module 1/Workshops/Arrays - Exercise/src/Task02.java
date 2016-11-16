import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter array size: ");
		int arrayLenght=sc.nextInt();
		int[] array=new int[arrayLenght];
		
		System.out.println("Enter elements of the array:");
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		for (int i = 0, j=array.length-1; i <= j; i++,j--) {
			if (array[i]!=array[j]) {
				System.out.print("The array is not mirrored.");
				break;
			}
			else if (array[i]==array[j]){
				System.out.print("The array is mirrored.");
			}
		}
	}
}
