package assignmentsgrowskill;

public class LoanEligibility8 {

	public static void main(String[] args) {
		int age = 28;
        int salary = 55000;

        if (age < 25) System.out.println("Not eligible");
        else if (salary < 30000) System.out.println("Eligible for loan A");
        else if (age >= 30 && salary >= 50000) System.out.println("Eligible for loan B");
        else System.out.println("Not eligible for any loan");
    }
	}


