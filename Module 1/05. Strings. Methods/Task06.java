/*
 * Задача 6:
Да се състави програма, чрез която се въвежда изречение с отделни
думи.
Като резултат на екрана да се извежда същия текст, но всяка отделна
дума да започва с главна буква, а следващите я букви да са малки.
Пример: супер яката задача
Изход: Супер Яката Задача
 */
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
