package assignmentsgrowskill;

public class FibonocciSeries {

	public static void main(String[] args) {
		  int n1 = 0,
				  n2 = 1, 
				  next;
	        System.out.print(n1 + " " + n2);
	        while (true) {
	            next = n1 + n2;
	            if (next > 500) break;
	            System.out.print(" " + next);
	            n1 = n2;
	            n2 = next;
	        }
	    }
	}


