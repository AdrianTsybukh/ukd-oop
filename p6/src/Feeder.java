class Feeder extends ZooEmployee {
    public Feeder(int id, String name, int experience) {
        super(id, name, experience, "Годувальник");
    }

    public void feedAnimal(Animal a, Food f, int quantity) {
        if (!canAccessPredator(a)) return;
        System.out.printf("%s намагається погодувати %s%n", getName(), a.getName());
        a.feed(f, quantity);
    }
}