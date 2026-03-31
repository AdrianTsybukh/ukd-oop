class Trainer extends ZooEmployee {
    public Trainer(int id, String name, int experience) {
        super(id, name, experience, "Тренувальник");
    }

    public void trainAnimal(Animal a) {
        if (!canAccessPredator(a)) return;
        System.out.printf("%s тренує %s...%n", getName(), a.getName());
        a.makeSound();
        a.move();
    }
}