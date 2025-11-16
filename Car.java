
class Car {
    String model;
    int year;
    double price;
    String type;

    public Car(String model, int year, double price, String type) {
        this.model = model;
        this.year = year;
        this.price = price;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Price: " + price + ", Type: " + type);
    }

    @Override
    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        System.out.println("(finalize()) Car object is being cleaned up: " + model + " (" + year + ")");
        super.finalize();
    }
}

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Car car1 = new Car("Model S", 2025, 250000.70, "hybrid");
        Car car2 = new Car("Model T", 2024, 550000.76, "Diesel");
        car1.displayInfo();
        car2.displayInfo();
    }
}
