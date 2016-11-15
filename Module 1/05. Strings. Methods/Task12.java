/*
 * Задача 12:
Да се създаде метод, който приема за входни данни число N и
връща масив от числа с дължина N, който съдържа всички числа
от 1 до N.
 */
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the array N:");
		int num = sc.nextInt();
		int[] array = оneТoN(num);
		System.out.println("The array from 1 to N looks like this:");
		System.out.print("[");
		for (int i = 0; i < array.length; i++) {
			if (i!=array.length-1) {
				System.out.print(array[i]+", ");
			}else {
				System.out.print(array[i]+"]");
			}
			
		}
		sc.close();

	}

	static int[] оneТoN(int number) {
		int[] arr = new int[number];
		arr[0] = 1;
		int tmp = 1;
		for (int i = 0; i < number; i++) {
			arr[i] = i + tmp;
		}
		return arr;
	}

}
