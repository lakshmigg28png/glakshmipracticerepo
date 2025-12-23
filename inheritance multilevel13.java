package oopsAssignments;
class Device {
    void start() {
        System.out.println("Device is starting...");
    }
}


class Mobile extends Device {
    void calling() {
        System.out.println("Mobile is calling...");
    }
}


class SmartPhone extends Mobile {
    void internet() {
        System.out.println("vivoPhone is browsing internet...");
    }
}
public class InheritanceMultilevel {
	public static void main(String[] args) {
        
        SmartPhone smartPhone = new SmartPhone();

        
        smartPhone.start();     
        smartPhone.calling();   
        smartPhone.internet(); 
    }
}
