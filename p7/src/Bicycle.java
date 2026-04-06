public class Bicycle extends Vehicle {

    public Bicycle(String brand, String model, int maxSpeed, int capacity) {
        super(brand, model, maxSpeed, capacity);
    }

    @Override
    public void displayInfo() {
        System.out.printf("[BICYCLE] Brand: %s | Model: %s | Max Speed: %d km/h%n", brand, model, maxSpeed);
    }

    @Override
    public void start() {
        currentSpeed = 15;
        System.out.printf("Bicycle %s %s started moving. Pedaling!%n", brand, model);
    }

    @Override
    public void stop() {
        currentSpeed = 0;
        System.out.printf("Bicycle %s %s stopped pedaling and braked.%n", brand, model);
    }
}