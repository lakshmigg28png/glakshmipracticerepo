package JavaProgramassignment;
class Student {
    static String collegeName; 
    String name;                
    int rollNo;                 

    
    void demo() {
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
    }
}
public class Static10 {
	public static void main(String[] args) {
        
        Student.collegeName = "Jawahrlal nehru University";

         Student s1 = new Student();
        s1.name = "lakshmi";
        s1.rollNo = 413;
        s1.demo();

        Student s2 = new Student();
        s2.name = "Yashan";
        s2.rollNo = 423;
        s2.demo();

        Student.collegeName = "Jawaharlal";
  System.out.println("\nAfter changing collegeName:");
        s1.demo();
        s2.demo();
    }
}
