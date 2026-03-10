import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(6, 9);
        Fraction f2 = new Fraction(2, 3);

        System.out.printf("Addition: %s\n", f1.addition(f2));
        System.out.printf("Subtraction: %s\n", f1.subtraction(f2));
        System.out.printf("Multiplication: %s\n", f1.multiplication(f2));
        System.out.printf("Division: %s\n", f1.division(f2));

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String[] hobbies = {
                "Skating",
                "Hiking",
                "Biking",
                "Programming",
                "Swimming",
        };
        ArrayList<Form> forms = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String name = String.format("Name %d", i + 1);
            int birthYear = rand.nextInt(1980, 2026);
            String hobby = hobbies[rand.nextInt(hobbies.length)];
            boolean isMarried = rand.nextBoolean();
            double salary = rand.nextDouble(100000, 5000000);
            forms.add(new Form(name, birthYear, hobby, isMarried, salary));
        }
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Birth age: ");
        int birthYear = sc.nextInt();
        sc.nextLine();

        System.out.print("Hobby: ");
        String hobby = sc.nextLine();

        System.out.print("Married (true/false): ");
        boolean isMarried = sc.nextBoolean();

        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        forms.add(new Form(name, birthYear, hobby, isMarried, salary));

        FormAnalytics analytics = new FormAnalytics(forms);

        System.out.printf("""
            Total forms count: %d
            Count by birth year: %d
            Average age: %.1f
            High earners: %s
            Average salary: %.2f
            Married count: %d
            Sorted by name: %s
            Sorted by age: %s
            """,
                analytics.getTotalFormsCount(),
                analytics.getCountByBirthYear(2000),
                analytics.getAverageAge(),
                analytics.getHighEarners(),
                analytics.getAverageSalary(),
                analytics.getMarriedCount(),
                analytics.getSortedByName(),
                analytics.getSortedByAge()
        );

        analytics.printTop3Hobbies();
    }
}