
class Transport {
    public void move() {
        System.out.println("The transport is moving.");
    }
}

class Bus extends Transport {
    public void carryPassengers() {
        System.out.println("The bus is carrying passengers.");
    }
}

class Truck extends Transport {
    public void carryGoods() {
        System.out.println("The truck is carrying goods.");
    }
}

public class Main {
    public static void main(String[] args) {
        Bus myBus = new Bus();
        System.out.println("Bus operations:");
        myBus.move();
        myBus.carryPassengers();
        System.out.println("---");

        Truck myTruck = new Truck();
        System.out.println("Truck operations:");
        myTruck.move();
        myTruck.carryGoods();
    }
}
