package assignmentsgrowskill;

public class NmberIsPalindrome {

	public static void main(String[] args) {
		int num = 413423;
        int original = num;
        int reversed = 0;
        
        do 
        {
            int digit = num % 10;           
            reversed = reversed * 10 + digit; 
            num = num / 10;                 
            
          if (num != 0 && reversed > original / 10) {
                System.out.println(original + " is NOT a palindrome.");
                return;
            }
        }
        while (num != 0);
        
       
        System.out.println(original + " is a palindrome.");
    }

	}


