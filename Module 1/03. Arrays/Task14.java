/*
 * Задача 14:
Имате предварително въведен едномерен масив, съдържащ реални
числа.
Да се състави програма, чрез която се избират само елементи от
масива със стойности от интервала [-2.99..2.99] и се отпечатват в нов
масив. Новият масив да се извежда на екрана.
Пример: 7.1,8.5,0.2,3.7,0.99,1.4,-3.5,-110,212,341,1.2
Изход: 0.2; 0.99; 1.4; 1.2
 */
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int arrayLength = sc.nextInt();
		double[] array = new double[arrayLength];

		System.out.println("Fill array with double values");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}

		int newArrayLength = 0;
		int index=0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= -2.99 && array[i] <= 2.99) {
				newArrayLength++;
			}
		}
		//System.out.println(newArrayLength);
		double[] secondArray = new double[newArrayLength];

		for (int i = 0; i < array.length; i++) {
			if (array[i] >= -2.99 && array[i] <= 2.99) {
				secondArray[index] = array[i];
				index++;
			}
		}

		for (int i = 0; i < secondArray.length; i++) {
			if (i != secondArray.length - 1) {
				System.out.print(secondArray[i] + "; ");
			} else {
				System.out.print(secondArray[i]);
			}

		}
		sc.close();

	}

}
