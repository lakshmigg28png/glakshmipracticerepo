package assignmentsgrowskill;

public class Checknumber {

	public static void main(String[] args) {
		int num = 51; 
        if ((num % 3 == 0) && (num % 5 != 0) && (num >= 50 && num <= 200)) {
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
    }


	}


