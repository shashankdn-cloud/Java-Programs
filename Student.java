public class Student {
    String name;
    int marks;

    void display(String name) {
        System.out.println("Name: " + name);
    }

    void display(String name, int marks) {
        System.out.println("Name: " + name + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display("Ravi");
        s.display("Ravi", 85);
    }
}