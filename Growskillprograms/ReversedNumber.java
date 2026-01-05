package assignmentsgrowskill;

public class ReversedNumber {

	public static void main(String[] args) {
		 int num = 413423;
	        int reversed = 0;
	        while (num != 0) {
	            int digit = num % 10;
	            if (digit == 0) break;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
	        System.out.println("Reversed: " + reversed);
	    }
	}


