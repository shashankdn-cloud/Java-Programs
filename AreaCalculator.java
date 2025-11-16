public class AreaCalculator {
    void area(int side) { 
        System.out.println("Area of Square: " + (side * side));
    }

    void area(int length, int breadth) { 
        System.out.println("Area of Rectangle: " + (length * breadth));
    }

    void area(double radius) { 
        System.out.println("Area of Circle: " + (3.14159 * radius * radius));
    }

    public static void main(String[] args) {
        AreaCalculator a = new AreaCalculator();
        a.area(5);
        a.area(4, 6);
        a.area(3.5);
    }
}