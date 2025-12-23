package oopsAssignments;
class LoanCalculator {
    public void calculateLoan(int amount) {
        double interestRate = 0.08; // default interest rate
        double interest = amount * interestRate;
        System.out.println("Loan Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate * 100 + "%");
        System.out.println("Total Interest: " + interest);
        System.out.println("Total Repayment: " + (amount + interest));
    }

    public void calculateLoan(int amount, double interestRate) {
        double interest = amount * interestRate;
        System.out.println("Loan Amount: " + amount);
        System.out.println("Interest Rate: " + interestRate * 100 + "%");
        System.out.println("Total Interest: " + interest);
        System.out.println("Total Repayment: " + (amount + interest));
    }
public class MethodOverloading15 {
	LoanCalculator calculator = new LoanCalculator();
    System.out.println("Loan calculation with default interest rate:");
    calculator.calculateLoan(100000);

    System.out.println("\nLoan calculation with custom interest rate:");
    calculator.calculateLoan(100000, 0.10);

}
}
