public class Motorcycle extends Vehicle implements Motorized {
    private double fuelLevel;
    private final double fuelConsumptionPer100Km;
    private boolean engineStarted;

    public Motorcycle(String brand, String model, int maxSpeed, int capacity, double initialFuel, double consumption) {
        super(brand, model, maxSpeed, capacity);
        this.fuelLevel = initialFuel;
        this.fuelConsumptionPer100Km = consumption;
        this.engineStarted = false;
    }

    @Override
    public void displayInfo() {
        System.out.printf("[MOTORCYCLE] Brand: %s | Model: %s | Max Speed: %d km/h | Fuel: %.2f L%n", brand, model, maxSpeed, fuelLevel);
    }

    @Override
    public void startEngine() {
        if (fuelLevel > 0) {
            engineStarted = true;
            System.out.printf("Motorcycle %s %s: Engine started. Revving!%n", brand, model);
        } else {
            System.out.printf("Motorcycle %s %s: Cannot start engine. Out of fuel.%n", brand, model);
        }
    }

    @Override
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.printf("Motorcycle %s %s refueled with %.2f liters. Total fuel: %.2f L%n", brand, model, amount, fuelLevel);
    }

    @Override
    public void displayMaxDistance() {
        double maxDistance = (fuelLevel / fuelConsumptionPer100Km) * 100;
        System.out.printf("Motorcycle %s %s: Max distance with current fuel is %.2f km%n", brand, model, maxDistance);
    }

    @Override
    public void start() {
        if (!engineStarted) {
            System.out.printf("Motorcycle %s %s: Cannot start moving, engine is off!%n", brand, model);
            return;
        }
        currentSpeed = 60;
        System.out.printf("Motorcycle %s %s started moving fast.%n", brand, model);
    }

    @Override
    public void stop() {
        currentSpeed = 0;
        engineStarted = false;
        System.out.printf("Motorcycle %s %s stopped.%n", brand, model);
    }
}