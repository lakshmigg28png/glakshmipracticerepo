package assignmentsgrowskill;

public class Divisibleby {

	public static void main(String[] args) {
		 int num = 10; 

	        if (num % 2 == 0 && num % 3 == 0)
	        {
	            System.out.println("A");
	        }else if (num % 3 == 0 && num % 2 != 0) 
	        {
	            System.out.println("B");
	        } else if (num % 2 == 0 && num % 3 != 0)
	        {
	            System.out.println("C");
	        } else {
	            System.out.println("D");
	        }
	    }
	}


