public class Task23 {

	public static void main(String[] args) {

		  int counterLeft = 1;
          int counterRight = 1;
          while (counterLeft <= 9)
          {
              counterRight = counterLeft;
              while (counterRight <= 9)
              {
                  System.out.print(counterLeft + "*" + counterRight + "; ");
                      counterRight++;
              }
              System.out.println();
              counterLeft++;
          }
      }
  }
