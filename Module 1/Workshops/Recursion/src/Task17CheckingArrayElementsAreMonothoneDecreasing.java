import java.util.Scanner;

public class Task17CheckingArrayElementsAreMonothoneDecreasing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arraySize=sc.nextInt();
		int[] array=new int[arraySize];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		if (monothoneDecresingRecursive(array, array.length-1)) {
			System.out.println("The array elements are monotonouslly decreasing.");
		}else {
			System.out.println("the array elements are not monotonouslly decreasing.");
		}

	}
	//checking if the array is monothone decreasing
	static boolean monothoneDecresingRecursive(int[] arr, int index){
		if (index==0) {
			return true;
		}if (arr[index]-arr[index-1]<=0) {
			return monothoneDecresingRecursive(arr, index-1);
		}else {
			return false;
		}
	}

}
