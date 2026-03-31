abstract class ZooEmployee {
    private int id;
    private String name;
    private int experience;
    private String role;

    public ZooEmployee(int id, String name, int experience, String role) {
        this.id = id;
        this.name = name;
        setExperience(experience);
        this.role = role;
    }

    public void setExperience(int experience) {
        if (experience < 1 || experience > 4) throw new IllegalArgumentException("Досвід має бути від 1 до 4");
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    public void tellAboutAnimal(Animal a) {
        System.out.printf("%s розповідає: %s%n", name, a.getInfo(true));
    }

    protected boolean canAccessPredator(Animal a) {
        if (a.getSpecies() == DietType.CARNIVORE && experience == 1) {
            System.out.printf("Відмова: Працівник %s має недостатньо досвіду для роботи з хижаками.%n", name);
            return false;
        }
        return true;
    }
}