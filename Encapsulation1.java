package oopsAssignments;
class Employee {
   
    private int empId;
    private String empName;
    private double salary;

   
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public double getSalary() {
        return salary;
    }

  public void setEmpId(int empId) {
        this.empId = empId;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

   
    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Encapsulation {
	public static void main(String[] args) {
        
        Employee emp = new Employee();

       
        emp.setEmpId(423);
        emp.setEmpName("Lakshmi");
        emp.setSalary(7500000.00);

        
        emp.displayDetails();
    }
}

