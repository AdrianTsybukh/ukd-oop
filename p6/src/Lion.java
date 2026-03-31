class Lion extends Animal {
    public Lion(String name, int age, double weight, String location) {
        super(name, DietType.CARNIVORE, age, weight, 80, location);
    }

    @Override
    public void makeSound() {
        System.out.printf("%s гарчить: Рррр!%n", getName());
    }

    @Override
    public void move() {
        System.out.printf("%s біжить на 4 лапах.%n", getName());
    }
}