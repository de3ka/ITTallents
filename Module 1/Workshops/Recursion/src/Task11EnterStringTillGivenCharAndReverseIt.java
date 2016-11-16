import java.util.Scanner;

public class Task11EnterStringTillGivenCharAndReverseIt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		String input = "";

		while (true) {
			input = sc.nextLine();
			if (input.equals("Z")) {
				sb.append(input);
				break;
			} else {
				sb.append(input);
			}
		}
		String newinput = sb.toString();
		System.out.println(newinput);
		
		String reverse=reveseStringRecursive(newinput);
		System.out.println(reverse);

	}
	//recursive reverse order of letters in the string
	static String reveseStringRecursive(String str){
		if (str.length()==0||str.length()==1) {
			return str;
		}
		return reveseStringRecursive(str.substring(1))+str.charAt(0);
	}

}
