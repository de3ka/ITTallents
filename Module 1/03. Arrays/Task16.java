/*
 * Задача 16:
Да се състави програма, чрез която предварително въведени 10
реални числа от интервала се обработват по следния начин:
1. Извежда съществуващите числа.
2. Всички елементи със стойност по-малки от -0.231 се заменят със
сумата от квадрата на поредния им номер + числото 41.25, а всички
останали елементи се заменят с произведението между самия елемент
и неговият пореден номер. Поредният номер на първият елемент е 1.
3. Да се изведат елементите от началния и новообразувания масив.
Пример: -1.12, -2.43, 3.1, 4.2, 0, 6.4, - 7.5, 8.6, 9.1, -4
Изход: 42.25, 45.25, 9.3, 16.8, 0, 38.4, 90.25, 68.8, 81.9,141.25
 */
import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrayLength = 10;
		float[] array = new float[arrayLength];
		int index = 1;
		System.out.println("Fill array with size 10 with numbers:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextFloat();
		}
		System.out.println("The entered array is:");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] <= -0.231f) {
				array[i] = (float) ((index * index) + 41.25f);
			} else {
				array[i] = (float) index * array[i];
			}
			index++;
		}

		System.out.println();
		System.out.println("The result array is:");
		for (int i = 0; i < array.length; i++) {
			if (i != array.length - 1) {
				System.out.print(array[i] + ", ");
			} else {
				System.out.print(array[i]);
			}
		}
		sc.close();

	}

}
