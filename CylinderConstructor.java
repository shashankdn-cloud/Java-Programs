public class CylinderConstructor {
    private double radius;
    private double height

    public CylinderConstructor(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }

    public static void main(String[] args) {
        CylinderConstructor c = new CylinderConstructor(5.0, 10.0);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Height: " + c.getHeight());
        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}