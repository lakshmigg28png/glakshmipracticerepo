package JavaProgramassignment;
public class Account {
    private String accountHolderName;
    private double balance;

    
    public String getAccountHolderName() {
        return accountHolderName;
    }

    
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

   
    public void setBalance(double balance) {
        if (balance < 0) {
            System.out.println("Warning: Negative balance value not allowed.");
        } else {
            this.balance = balance;
        }
    }

    public static void main(String[] args) {
        
        Account account = new Account();

        
        account.setAccountHolderName("Lakshmi");
        account.setBalance(1000000.0);
        account.setBalance(-500.0);  // This should print a warning

       
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());
    } {

}
}
