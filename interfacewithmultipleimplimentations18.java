package oopsAssignments;
interface Transport {
    void booking();
}


class Bus implements Transport {
  public void booking() {
        System.out.println("Bus ticket booked.");
    }
}


class Flight implements Transport {
 
    public void booking() {
        System.out.println("Flight ticket booked.");
    }
}

public class InterfaceWithMultipleImplimentations {
	public static void main(String[] args) {
       
        Transport t1 = new Bus();
        t1.booking();  

        Transport t2 = new Flight();
        t2.booking(); 
}
	
	
}
