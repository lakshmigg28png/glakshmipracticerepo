package assignmentsgrowskill;

public class SumEven {

	public static void main(String[] args) {
		 int num = 543, sum = 0;
	        while (num >= 0) {
	            if (num % 2 == 0) sum += num;
	            num -= 2;
	        }
	        System.out.println("Sum: " + sum);
	    }

	}


