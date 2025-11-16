class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, double salary, String department) {
        super(name, salary); 
        this.department = department
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice Johnson", 75000.0, "Human Resources");
        System.out.println("Manager Details:");
        manager.displayInfo();
    }
}