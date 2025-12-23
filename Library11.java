package oopsAssignments;

public class Library {
	
	    String libraryName;

	  public Library() {
	        System.out.println("Welcome to the Library!");
	    }

	   public void showLocation() {
	        System.out.println("This library is located in Growskill");
	    }

	    public static void main(String[] args) {
	       
	        Library lib = new Library();
	        lib.showLocation();
	    }
	}

