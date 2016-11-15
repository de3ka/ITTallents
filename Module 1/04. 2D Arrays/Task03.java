/*
 * Задача 3:
Имате двумерен масив от числа, чийто стойности са въведени
предварително. Да се отпечатат сумата на елементите на масива,
както и средноаритметичното на тези числа.
 */
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of rows of the array:");
		int rows = sc.nextInt();
		System.out.println("Enter size of colums of the array:");
		int cols = sc.nextInt();
		int[][] array = new int[rows][cols];
		System.out.println("Fill array with numbers: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = sc.nextInt();
			}
		}

		// print the array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

		// find sum of all elements in array
		double sum = 0;
		double average = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
			}
		}
		double elementsCount = rows * cols;
		average = (double) (sum / elementsCount);
		System.out.println("Sum is: " + sum);
		System.out.println("Average is: " + average);
		sc.close();

	}

}
