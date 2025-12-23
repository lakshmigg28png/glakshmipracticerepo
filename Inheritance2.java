package oopsAssignments;
class Vehicle {
    
    public void fuelType() {
        System.out.println("Runs on fuel");
    }
}


class ElectricCar extends Vehicle {
  
    public void fuelType() {
        System.out.println("Runs on electricity");
    }
}

public class Inheritance {
	public static void main(String[] args) {
       
        Vehicle vehicle = new Vehicle();
        System.out.println("Vehicle:");
        vehicle.fuelType();  

        
        ElectricCar electricCar = new ElectricCar();
        System.out.println("ElectricCar:");
        electricCar.fuelType();
	}
}      

