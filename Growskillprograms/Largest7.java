package assignmentsgrowskill;

public class Largest7 {

	public static void main(String[] args) {
int a = 10, b = 20, c = 30, d = 40;
        
        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("Largest: " + a);
                } else {
                    System.out.println("Largest: " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Largest: " + c);
                } else {
                    System.out.println("Largest: " + d);
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println("Largest: " + b);
                } else {
                    System.out.println("Largest: " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Largest: " + c);
                } else {
                    System.out.println("Largest: " + d);
                }
            }
        }
    }
	}


