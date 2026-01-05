package assignmentsgrowskill;

public class Eligibilitycheck {

	public static void main(String[] args) {
		 int math = 70, physics = 60, chemistry = 50;

	        if (math >= 60 && physics >= 50 && chemistry >= 40 && 
	            (math + physics + chemistry >= 180 || math + physics >= 120)) {
	            System.out.println("Eligible");
	        } else {
	            System.out.println("Not Eligible");
	        }
	    }
	}


