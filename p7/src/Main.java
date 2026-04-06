public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car("Toyota", "Camry", 220, 5, 10.5, 8.0);
        vehicles[1] = new Motorcycle("Yamaha", "R1", 299, 2, 5.0, 6.5);
        vehicles[2] = new Bicycle("Trek", "Marlin", 40, 1);

        testAllVehicles(vehicles);
    }

    public static void testAllVehicles(Vehicle[] vehicles) {
        for (Vehicle v : vehicles) {
            System.out.printf("%n--- Testing Object: %s ---%n", v.getClass().getSimpleName());

            v.displayInfo();
            v.displayCapacity();

            if (v instanceof Motorized) {
                Motorized motorizedVehicle = (Motorized) v;

                v.start();

                motorizedVehicle.refuel(20.0);
                motorizedVehicle.displayMaxDistance();
                motorizedVehicle.startEngine();
            }

            v.start();
            v.displayCurrentSpeed();
            v.stop();
            v.displayCurrentSpeed();
        }
    }
}