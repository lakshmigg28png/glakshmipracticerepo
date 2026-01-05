package assignmentsgrowskill;

public class PerfectNumbers {

	public static void main(String[] args) {
		  System.out.println("Perfect numbers between 1 and 10000:");
	        for (int num = 1; num <= 10000; num++) {
	            int sum = 0;
	            for (int i = 1; i < num; i++) {
	                if (num % i == 0) {
	                    sum += i;
	                }
	            }
	            if (sum == num) {
	                System.out.println(num);
	            }
	        }
	    }
	

	}


