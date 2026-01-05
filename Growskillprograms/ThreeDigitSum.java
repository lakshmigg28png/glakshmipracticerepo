package assignmentsgrowskill;

public class ThreeDigitSum {

	public static void main(String[] args) {
		 int num = 321; 
	        if (num >= 100 && num <= 999) { 
	            int sum = 0, temp = num;
	            while (temp != 0) { 
	                sum += temp % 10;
	                temp /= 10;
	            }
	            if (sum % 2 == 0) {
	                System.out.println("Sum of digits is even");
	            } else {
	                System.out.println("Sum of digits is odd");
	            }
	        } else {
	            System.out.println("Not a 3-digit number");
	        }
	    }
	}


