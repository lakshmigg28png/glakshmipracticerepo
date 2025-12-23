package oopsAssignments;
class Bank {
    final String IFSC = "HDFCBANK1234";

    final void showIFSC() {
        System.out.println("IFSC Code: " + IFSC);
    }
}

class HDFCBank extends Bank {
   
    //     System.out.println("Trying to override final method");
}

public class Final {
	public static void main(String[] args) {
        Bank bank = new Bank();
        bank.showIFSC(); 

        HDFCBank hdfc = new HDFCBank();
        hdfc.showIFSC(); 
    }

}
