package oopsAssignments;
class Calculator {
    
    int add(int a, int b) {
        return a + b;
    }

    
    double add(double a, double b) {
        return a + b;
    }
}
public class MethodOverloading {
	 public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        
	         int sumInt = calc.add(100, 250);
	        System.out.println("Sum of integers: " + sumInt);
	        
	        double sumDouble = calc.add(5.78, 875.5);
	        System.out.println("Sum of doubles: " + sumDouble);
}
}
