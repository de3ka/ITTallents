
/*
 * Задача 15:
Да се състави програма, която въвежда в едномерен масив реални
числа.
Като изход: програма извежда онези 3 различни числа, чиято
абсолютна стойност формира максималната обща сума.
Пример: 7.13; 0.2; 4.9; 5.1; 6.34; 1.12
Изход: 5.1; 6.34; 7.13
 */
import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size:");
		int arrayLength = sc.nextInt();
		double[] array = new double[arrayLength];
		// double[] secondArray=new double[3];

		System.out.println("Fill array with numbers: ");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextDouble();
		}

		double temp = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] < 0) {
					array[j] = array[j] * (-1);
				}
				if (array[j] < array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.print(array[i] + ", ");
		}

	}
}
