import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int numberOne = sc.nextInt();
		System.out.print("Enter second number: ");
		int numberTwo = sc.nextInt();
		int sum = 0;
		int square = 0;
		
		if (numberOne<=numberTwo) {
			
			for (int i = numberOne; i <= numberTwo; i++) {
				square = i * i;

				if (square % 3 != 0) {
					sum += square;
					if (sum <= 200) {
						System.out.print(square + ", ");
						//System.out.print("sum=" + sum + "; ");
					} else if(sum>200){
						break;
					}
				} else if (square % 3 == 0) {
					System.out.print("skip3" + ", ");
					continue;
				}

			}
		}
		else {

			for (int i = numberOne; i >=numberTwo ; i--) {
				square = i * i;

				if (square % 3 != 0) {
					sum += square;
					if (sum <= 200) {
						System.out.print(square + ", ");
						//System.out.print("sum=" + sum + "; ");
					} else if(sum>200){
						break;
					}
				} else if (square % 3 == 0) {
					System.out.print("skip3" + ", ");
					continue;
				}

			}
		}
		sc.close();
	}
}
