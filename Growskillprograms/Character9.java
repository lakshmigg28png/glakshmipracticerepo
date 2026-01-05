package assignmentsgrowskill;

public class Character9 {

	public static void main(String[] args) {
		char ch = 'A'; 

        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                System.out.println("Uppercase vowel");
            else
                System.out.println("Uppercase consonant");
        } else if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Lowercase vowel");
            else
                System.out.println("Lowercase consonant");
        } else {
            System.out.println("Not a letter");
        }
    }
	}


