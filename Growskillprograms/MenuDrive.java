package assignmentsgrowskill;

public class MenuDrive {

	public static void main(String[] args) {
		int choice = 1;
        double a = 413, 
        		b = 423;
        do {
            System.out.println("1. Add\n2. Subtract\n3. Multiply\n4. Exit");
            System.out.println("Choice: " + choice);
            if (choice >= 1 && choice <= 3) {
                if (choice == 1) System.out.println("Result: " + (a + b));
                if (choice == 2) System.out.println("Result: " + (a - b));
                if (choice == 3) System.out.println("Result: " + (a * b));
            }
            choice++;
        } while (choice != 4);
    }
	}


