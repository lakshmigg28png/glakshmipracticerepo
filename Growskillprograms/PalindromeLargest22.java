package assignmentsgrowskill;

public class PalindromeLargest22 {

	public static void main(String[] args) {
		int maxPalindrome = 0;
        for (int i = 999; i >= 100; i--) {
            if (isPalindrome(i)) {
                maxPalindrome = i;
                break;
            }
        }
        System.out.println("Largest palindrome between 100 and 1000: " + maxPalindrome);
    }

    static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

	}

}
