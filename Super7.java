package oopsAssignments;
class Person {
    Person() {
        System.out.println("Person Created");
    }
}

class Student1 extends Person {
    Student1() {
        super();
        System.out.println("Student Created");
    }
}

public class Super {
	public static void main(String[] args) {
        Student1 s = new Student1();
    }

}
