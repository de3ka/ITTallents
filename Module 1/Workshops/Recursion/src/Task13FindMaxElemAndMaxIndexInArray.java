import java.util.Scanner;

public class Task13FindMaxElemAndMaxIndexInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] array=new int[9];
		for (int i = 0; i < array.length; i++) {
			array[i]=sc.nextInt();
		}
		int startIndex=0;
		int maxIndex=maxElementIndexRecursive(array, startIndex);
		System.out.println("The index of the max element of the array is - " + maxIndex);
		System.out.println("The max element of the array is - "+array[maxIndex]); 

	}
//find max element index of the array
	static int maxElementIndexRecursive(int[]arr, int index){
		if (index==arr.length-1) {
			return index;
		}
		int maxElementIndex=maxElementIndexRecursive(arr, index+1);
		if (arr[index]>arr[maxElementIndex]) {
			return index;
		}else {
			return maxElementIndex;
		}
		
	}

}
