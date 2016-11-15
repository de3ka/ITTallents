
/*
 * Задача 14:
Да се състави програма, която по въведени координати на 2 позиции
от шахматната дъска извежда отговор дали са оцветени в еднакъв или
различен цвят.Шахматната дъска е квадратна.
Въвеждат се две двойки числа от интервала [1..8].
Пример: 2 2 3 2
Изход: Позициите са с различен цвят
 */
import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		byte positionOneX;
		byte positionOneY;
		byte positionTwoX;
		byte positionTwoY;

		do {
			System.out.print("Enter X coordinate [1..8] of the first position: ");
			positionOneX = sc.nextByte();
			System.out.print("Enter Y coordinate [1..8] of the first position: ");
			positionOneY = sc.nextByte();
			System.out.print("Enter X coordinate [1..8] of the second position: ");
			positionTwoX = sc.nextByte();
			System.out.print("Enter Y coordinate [1..8] of the second position: ");
			positionTwoY = sc.nextByte();

		} while (positionOneX < 1 || positionOneX > 8 || positionOneY < 1 || positionOneY > 8 
				|| positionTwoX < 1 || positionTwoX > 8 || positionTwoY < 1 || positionTwoY > 8);

		// white
		if ((positionOneX % 2 != 0 && positionOneY % 2 != 0) 
				&& (positionTwoX % 2 != 0 && positionTwoY % 2 != 0)) {
			System.out.println("Positions are the same colour.");
		} else if (positionOneX % 2 == 0 && positionOneY % 2 == 0 
				&& (positionTwoX % 2 == 0 && positionTwoY % 2 == 0)) {
			System.out.println("Positions are the same colour.");
		} else if ((positionOneX % 2 != 0 && positionOneY % 2 != 0)
				&& (positionTwoX % 2 == 0 && positionTwoY % 2 == 0)) {
			System.out.println("Positions are the same colour.");
		} else if ((positionOneX % 2 == 0 && positionOneY % 2 == 0)
				&& (positionTwoX % 2 != 0 && positionTwoY % 2 != 0)) {
			System.out.println("Positions are the same colour.");
		}

		// black
		else if ((positionOneX % 2 != 0 && positionOneY % 2 == 0) 
				&& (positionTwoX % 2 != 0 && positionTwoY % 2 == 0)) {
			System.out.println("Positions are the same colour.");
		} else if ((positionOneX % 2 == 0 && positionOneY % 2 != 0)
				&& (positionTwoX % 2 == 0 && positionTwoY % 2 != 0)) {
			System.out.println("Positions are the same colour.");
		} else if ((positionOneX % 2 != 0 && positionOneY % 2 == 0)
				&& (positionTwoX % 2 == 0 && positionTwoY % 2 != 0)) {
			System.out.println("Positions are the same colour.");
		} else if ((positionOneX % 2 == 0 && positionOneY % 2 != 0)
				&& (positionTwoX % 2 != 0 && positionTwoY % 2 == 0)) {
			System.out.println("Positions are the same colour.");
		} else {
			System.out.println("Positions are not the same colour.");
		}
		sc.close();

	}
}
