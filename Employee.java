class Employee {
    private int salary;
    private String name;

    Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee(50000, "Shashank");
        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
        e1.setName("Priya");
        System.out.println("Updated Name: " + e1.getName());
    }
}