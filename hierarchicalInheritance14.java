package oopsAssignments;
class Course {
    void courseInfo() {
        System.out.println("This is a general Course.");
    }
}

// Subclass Science inheriting Course
class Science extends Course {
    void scienceInfo() {
        System.out.println("This is the Science stream.");
    }
}

// Subclass Commerce inheriting Course
class Commerce extends Course {
    void commerceInfo() {
        System.out.println("This is the Commerce stream.");
    }
}

// Subclass Arts inheriting Course
class Arts extends Course {
    void artsInfo() {
        System.out.println("This is the Arts stream.");
    }
}

public class hierarchicalInheritance {
	public static void main(String[] args) {
        
        Science sci = new Science();
        Commerce com = new Commerce();
        Arts art = new Arts();

        
        System.out.println("Science Class:");
        sci.courseInfo();  
        sci.scienceInfo();
        System.out.println("\nCommerce Class:");
        com.courseInfo();  
        com.commerceInfo();

        System.out.println("\nArts Class:");
        art.courseInfo(); 
        art.artsInfo();    
    }
}

