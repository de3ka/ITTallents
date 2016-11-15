public class Task12 {

	public static void main(String[] args) {
		
		for (int number = 100; number <999; number++) {
			
			int currentNum=number;
			
			int lastDigit=currentNum%10;
			currentNum/=10;
			int secondDigit=currentNum%10;
			currentNum/=10;
			int firstDigit=currentNum%10;
			
			if (firstDigit==lastDigit || firstDigit==secondDigit || secondDigit==lastDigit) {
				currentNum= (firstDigit*100)+secondDigit*10+lastDigit;
			}
			if (number==currentNum) {
				continue;
			}
				System.out.println(number);
			}
			
		}

	}

