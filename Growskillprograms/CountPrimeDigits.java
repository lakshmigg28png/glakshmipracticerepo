package assignmentsgrowskill;

public class CountPrimeDigits {

	public static void main(String[] args) {
		   int num = 413423;
	        int count = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
	                count++;
	            }
	            num /= 10;
	        }
	        System.out.println("Count of prime digits: " + count);
	    }

	}


