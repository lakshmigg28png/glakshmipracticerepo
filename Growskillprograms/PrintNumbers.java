package assignmentsgrowskill;

public class PrintNumbers {

	public static void main(String[] args) {
		  int num = 1;
	        while (num <= 100 && num != 77) {
	            if (num % 3 != 0 || num % 5 != 0) {
	                System.out.println(num);
	            }
	            num++;
	        }
	    }
	}


