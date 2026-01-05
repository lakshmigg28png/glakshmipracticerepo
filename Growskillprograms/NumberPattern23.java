package assignmentsgrowskill;

public class NumberPattern23 {

	public static void main(String[] args) {
		int n = 5; 
        int skip = 3;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j != skip) { 
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
	}


