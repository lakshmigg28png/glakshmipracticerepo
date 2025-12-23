package oopsAssignments;
interface Payment {
    void makePayment();
}


class UPI implements Payment {
  
    public void makePayment() {
        System.out.println("Payment made using UPI.");
    }
}


class CreditCard implements Payment {
    @Override
    public void makePayment() {
        System.out.println("Payment made using Credit Card.");
    }
}

public class Interface {
	public static void main(String[] args) {
        // Creating interface references
        Payment upiPayment = new UPI();
        Payment creditCardPayment = new CreditCard();

        // Calling the makePayment method through interface references
        upiPayment.makePayment();
        creditCardPayment.makePayment();
    }
}

