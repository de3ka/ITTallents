import java.util.Scanner;

public class Task16CheckingIfThereAreRepeatingNumsInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		if (repeatNumsRecursive(array, array.length-1)) {
			System.out.println("No repating numbers in array.");
		}else {
			System.out.println("There are repeating numbers in the array.");
		}

	}
	//checking if there is repeating numbers in array recirsively
	static boolean repeatNumsRecursive(int[] array, int index){
		if (index==0) {
			return true;
		}if (array[index-1]!=array[index]) {
			return repeatNumsRecursive(array, index-1);
		}else {
			return false;
		}
	}

}
