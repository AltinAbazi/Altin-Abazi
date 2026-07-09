package inheritance;

//  Write a Java program to create a class called Employee with 
// methods called work() and getSalary(). Create a subclass called 
// HRManager that overrides the work() method and adds a new method 
// called addEmployee().
public class Employee {

    public void work() {
    System.out.println("Employee is working");
        }

    public double getSalary() {
    return 5000;
        }

    public static void main(String[] args) {

    HRManager hr = new HRManager();

    hr.work();
System.out.println("Salary: " + hr.getSalary());
        hr.addEmployee();
        }
}

class HRManager extends Employee {

    @Override
    public void work() {
    System.out.println("HR Manager is managing employees");
        }

    public void addEmployee() {
    System.out.println("New employee added");
        }
}