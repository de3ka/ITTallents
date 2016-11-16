import java.util.Scanner;

public class Task04PrintTriangleOfNumbersInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNum = sc.nextInt();
		int endNum = sc.nextInt();
		printrecursiveTriangle(startNum, endNum);

	}

	static String printrecursiveTriangle(int numOne, int numTwo) {
		if (numTwo < numOne) {
			return "";
		}
		String p = printrecursiveTriangle(numOne, (numTwo - 1));
		p = p + numTwo+" ";
		System.out.println(p);

		return p;
	}
}
