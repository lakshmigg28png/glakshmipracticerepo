package assignmentsgrowskill;

public class SequenceWhile {

	public static void main(String[] args) {
		int N = 3;
        int term = 1, increment = 1, count = 0;
        while (count < N) {
            System.out.print(term + " ");
            term += increment;
            increment++;
            count++;
        }
    }
	}


