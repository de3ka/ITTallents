import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int number = sc.nextInt();
		
		System.out.println("The first n numbers strarting from 3 and divisable by 3 are:");
		
		for (int i = 3; i <=3*number; i++) {
			if (i%3==0) {
				System.out.print(i + ", ");
			}
			sc.close();
		}

	}

}
