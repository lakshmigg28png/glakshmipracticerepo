package oopsAssignments;
class University {
    static String country = "India";  
    String universityName;            

    
    University(String universityName) {
        this.universityName = universityName;
    }

    
    void demo() {
        System.out.println("University Name: " + universityName);
        System.out.println("Country: " + country);
    }
}

public class StaticConcepts {
	public static void main(String[] args) {
       
        University u1 = new University("jawaharlal");
        University u2 = new University("jawaharlal nehru");

        
        System.out.println("Object u1:");
        u1.demo();

        System.out.println("\nObject u2:");
        u2.demo();

        University.country = "india";
         System.out.println("\nAfter changing static variable:");
        System.out.println("Object u1:");
        u1.demo();

        System.out.println("\nObject u2:");
        u2.demo();
    }
}

