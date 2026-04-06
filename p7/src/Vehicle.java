public abstract class Vehicle implements Drivable {
    protected String brand;
    protected String model;
    protected int maxSpeed;
    protected int capacity;
    protected int currentSpeed;

    public Vehicle(String brand, String model, int maxSpeed, int capacity) {
        this.brand = brand;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.capacity = capacity;
        this.currentSpeed = 0;
    }

    public void displayInfo() {
        System.out.printf("Brand: %s | Model: %s | Max Speed: %d km/h%n", brand, model, maxSpeed);
    }

    public void displayCurrentSpeed() {
        System.out.printf("[%s %s] Current speed: %d km/h%n", brand, model, currentSpeed);
    }

    public void displayCapacity() {
        System.out.printf("[%s %s] Capacity: %d persons%n", brand, model, capacity);
    }
}