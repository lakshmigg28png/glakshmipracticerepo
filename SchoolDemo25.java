package JavaProgramassignment;
class school {
    String name;

   
    school() {
        System.out.println("School name: Z.p.h.s");
    }

   void displayMessage() {
        System.out.println("This School is based out of Agali");
    }
}
public class SchoolDemo {
	public static void main(String[] args) {
        
        school mySchool = new school();
        
        mySchool.displayMessage();
    }
}
