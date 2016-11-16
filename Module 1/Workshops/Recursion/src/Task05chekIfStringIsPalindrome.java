import java.util.Scanner;

public class Task05chekIfStringIsPalindrome {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  String inputText=sc.nextLine();
		  boolean result=isPalindromeRecursive(inputText);
		  System.out.println("Is '"+inputText+"' a palindome? - "+result);
		  sc.close();

	}
	static boolean isPalindromeRecursive(String str){
		if (str.length()==0 || str.length()==1) {
			// if length =0 OR 1 then it is
			return true;
		}
		if (str.charAt(0)==str.charAt(str.length()-1)) {
			// check for first and last char of String:
            // if they are same then do the same thing for a substring
            // with first and last char removed. and carry on this
            // until you string completes or condition fails
			return isPalindromeRecursive(str.substring(1, str.length()-1));
		}
		// if its not the case than string is not.
		return false;
		
	}

}
