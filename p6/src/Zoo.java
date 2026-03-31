import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();
    private List<ZooEmployee> employees = new ArrayList<>();

    public void addAnimal(Animal a) {
        animals.add(a);
    }

    public void addEmployee(ZooEmployee e) {
        employees.add(e);
    }

    public void changeEmployeeExperience(int employeeId, int newExperience) {
        if (employeeId >= 0 && employeeId < employees.size()) {
            employees.get(employeeId).setExperience(newExperience);
            System.out.printf("Досвід працівника змінено.%n");
        }
    }

    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        Animal lion = new Lion("Сімба", 5, 190.5, "Вольєр 1");
        Animal elephant = new Elephant("Дамбо", 10, 3000.0, "Вольєр 2");
        Animal monkey = new Monkey("Абу", 3, 15.2, "Вольєр 3");

        zoo.addAnimal(lion);
        zoo.addAnimal(elephant);
        zoo.addAnimal(monkey);

        Feeder rookieFeeder = new Feeder(0, "Іван", 1);
        Trainer expertTrainer = new Trainer(1, "Олена", 4);

        zoo.addEmployee(rookieFeeder);
        zoo.addEmployee(expertTrainer);

        Food meat = new Food("Яловичина", FoodType.MEAT, 30);
        Food grass = new Food("Свіжа трава", FoodType.PLANT, 10);

        System.out.printf("--- Тестування інформації ---%n");
        rookieFeeder.tellAboutAnimal(lion);

        System.out.printf("%n--- Тестування обмежень доступу та харчування ---%n");
        rookieFeeder.feedAnimal(lion, meat, 1);

        zoo.changeEmployeeExperience(0, 2);
        rookieFeeder.feedAnimal(lion, grass, 1);
        rookieFeeder.feedAnimal(lion, meat, 2);

        System.out.printf("%n--- Тестування тренування та поліморфізму ---%n");
        expertTrainer.trainAnimal(elephant);
        expertTrainer.trainAnimal(monkey);
    }
}