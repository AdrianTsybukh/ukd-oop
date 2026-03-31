class Elephant extends Animal {
    public Elephant(String name, int age, double weight, String location) {
        super(name, DietType.HERBIVORE, age, weight, 50, location);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s трубить хоботом.%n", getName());
    }

    @Override
    public void move() {
        System.out.printf("%s повільно крокує.%n", getName());
    }
}