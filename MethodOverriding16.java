package oopsAssignments;
class Hospital {
    public void emergencyService() {
        System.out.println("Hospital: Emergency service available.");
    }
}

class CityHospital extends Hospital {
  
    public void emergencyService() {
        super.emergencyService(); 
        System.out.println("CityHospital: Specialized emergency service provided.");
    }
}
public class MethodOverriding {
	  public static void main(String[] args) {
	        Hospital h = new Hospital();
	        CityHospital ch = new CityHospital();

	        System.out.println("Calling base class method:");
	        h.emergencyService();

	        System.out.println("\nCalling overridden method:");
	        ch.emergencyService();
	    }
	}

