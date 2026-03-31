class Monkey extends Animal {
    public Monkey(String name, int age, double weight, String location) {
        super(name, DietType.OMNIVORE, age, weight, 60, location);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s кричить: У-у-а-а!%n", getName());
    }

    @Override
    public void move() {
        System.out.printf("%s стрибає по деревах.%n", getName());
    }
}