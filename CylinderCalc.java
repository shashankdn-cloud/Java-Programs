public class CylinderCalc {
    private double radius;
    private double height;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setHeight(double height) {
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
        CylinderCalc c = new CylinderCalc();
        c.setRadius(5.0);
        c.setHeight(10.0);

        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}