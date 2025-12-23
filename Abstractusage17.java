package JavaProgramassignment;
abstract class Employee {
    String name;
    int id;

    // Constructor
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract void calculateSalary();
void employeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class FullTimeEmployee extends Employee {
    double monthlySalary;
 FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

   void calculateSalary() {
        System.out.println("Full-time salary: " + monthlySalary);
    }
}
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    
    void calculateSalary() {
        double salary = hourlyRate * hoursWorked;
        System.out.println("Part-time salary: " + salary);
    }
}

public class Abstract {
	public static void main(String[] args) {
        Employee fullTime = new FullTimeEmployee("lakshmi", 423, 500000);
        fullTime.employeeDetails();
        fullTime.calculateSalary();

        Employee partTime = new PartTimeEmployee("Yashan", 412, 200000, 80);
        partTime.employeeDetails();
        partTime.calculateSalary();
    }
}
