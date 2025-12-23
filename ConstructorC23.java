package oopsAssignments;
public class Mall {
    
    public Mall() {
        System.out.println("Welcome to the Mall");
    }

 
    public Mall(String message) {
        this();
        System.out.println("Message: " + message);
    }

   
public class ConstructorC23 {
	 Mall mall1 = new Mall();
     
     System.out.println("-------------------");
     
     
     Mall mall2 = new Mall("Enjoy shopping!");
 }
}
