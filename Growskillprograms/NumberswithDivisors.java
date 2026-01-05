package assignmentsgrowskill;

public class NumberswithDivisors {

	public static void main(String[] args) {
		System.out.println("Numbers between 1 and 500 with exactly 3 divisors:");
        for (int i = 2; i <= 500; i++) {
            if (hasExactlyThreeDivisors(i)) {
                System.out.print(i + " ");
            }
        }
    }

    
    static boolean hasExactlyThreeDivisors(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n) return false; 
         return isPrime(sqrt);
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
	}


