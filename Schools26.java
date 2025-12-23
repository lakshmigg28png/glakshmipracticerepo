package oopsAssignments;
class School {
    String name;
    String address;
    int strength;

    
    School(String name, String address) {
        this.name = name;
        this.address = address;
        this.strength = 0; 
    }

    
    School(String name, String address, int strength) {
        this.name = name;
        this.address = address;
        this.strength = strength;
    }


    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Strength: " + strength);
    }
}

public class Schools {
	public static void main(String[] args) {
        
        School school1 = new School("z.p.h.s", "423 Main St");
        School school2 = new School("z.p.h.ss", "413 Elm St", 500);

       
        school1.displayDetails();
        System.out.println();
        school2.displayDetails();
    }
}

