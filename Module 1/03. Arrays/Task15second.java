
/*
 * Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
Пример2: -5.0 0.3 3.2 -8.1 10.1 -8.8 10.1
Изход2: 10.1; -8.8; -8.1
 */
import java.util.Scanner;

public class Task15second {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		double[] array = new double[arrayLength];
		int[] sign = new int[arrayLength];

		System.out.println("Fill array with numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}
		// saving the minus sign in a temp array and getting the abs value of
		// every element in the original array
		double temp = 0;
		int signtemp = 0;
		for (int i = 0; i < arrayLength; i++) {
			if (array[i] < 0) {
				sign[i] = -1;
				array[i] = array[i] * (-1);
			} else {
				sign[i] = 1;
			}
		}
		// sorting the array
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < array[j + 1]) {
					temp = array[j];
					signtemp = sign[j];
					array[j] = array[j + 1];
					sign[j] = sign[j + 1];
					array[j + 1] = temp;
					sign[j + 1] = signtemp;
				}
			}
		}
		// returning the minus sign to the sorted array
		for (int i = 0; i < arrayLength; i++) {
			array[i] = array[i] * sign[i];
		}
		System.out.println();
		System.out.println("Printing the 3 different numbers, which abs value is the highest:");
		for (int i = 0; i < 3; i++) {
			if (array[i] == array[i + 1]) {
				array[i + 1] = array[i + 2];
			}
			System.out.print(array[i] + " ");
		}
		sc.close();
	}

}
