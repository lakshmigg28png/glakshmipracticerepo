package assignmentsgrowskill;

public class PrintDigitsLeftToRight {

	public static void main(String[] args) {
		int num = 413423;
        int divisor = (int) Math.pow(10, (int) Math.log10(num));
        do 
        {
            int digit = num / divisor;
            System.out.print(digit + " ");
            num = num % divisor;
            divisor /= 10;
        } 
        while (divisor > 0);
    }

	}


