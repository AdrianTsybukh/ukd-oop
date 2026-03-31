abstract class Animal {
    private String name;
    private DietType species;
    private int age;
    private double weight;
    protected int hungerLevel;
    private String location;

    public Animal(String name, DietType species, int age, double weight, int hungerLevel, String location) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.hungerLevel = hungerLevel;
        this.location = location;
    }

    public DietType getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public abstract void makeSound();

    public abstract void move();

    public void feed(Food food) {
        feed(food, 1);
    }

    public void feed(Food food, int quantity) {
        if ((species == DietType.CARNIVORE && food.getType() == FoodType.PLANT) ||
                (species == DietType.HERBIVORE && food.getType() == FoodType.MEAT)) {
            System.out.printf("Помилка: %s не їсть таку їжу (%s).%n", name, food.getName());
            return;
        }
        hungerLevel -= (food.getNutrition() * quantity);
        if (hungerLevel < 0) hungerLevel = 0;
        System.out.printf("%s з'їв %d порцій %s. Рівень голоду: %d%n", name, quantity, food.getName(), hungerLevel);
    }

    public String getInfo() {
        return String.format("%s (%s), локація: %s", name, species, location);
    }

    public String getInfo(boolean fullInfo) {
        if (!fullInfo) return getInfo();
        return String.format("Ім'я: %s, Вид: %s, Вік: %d, Вага: %.2f, Голод: %d, Локація: %s",
                name, species, age, weight, hungerLevel, location);
    }
}