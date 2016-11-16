import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String inputString=sc.nextLine();
		char[] text=inputString.toCharArray();
		
		text[0]=Character.toUpperCase(text[0]);

	    for(int i=0;i<text.length;i++)
	    {
	        if(text[i] == ' ')
	        {                   
	            text[i+1] =  Character.toUpperCase(text[i+1]);
	        }
	        System.out.print(text[i]);
	    }
	    sc.close();
	}  

	}
