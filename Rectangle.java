import java.util.Scanner;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        length = 4;
        breadth = 5;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    public int area() {
        return length * breadth;
    }

    public void display() {
        System.out.println("Length: " + length + ", Breadth: " + breadth);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle r1 = new Rectangle();
        System.out.println("=== Default Rectangle ===");
        r1.display();
        System.out.println("Area: " + r1.area());

        // Using parameterized constructor with user input
        System.out.println("\nEnter length and breadth for custom rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("\n=== Custom Rectangle ===");
        r2.display();
        System.out.println("Area: " + r2.area());

        sc.close();
    }
}