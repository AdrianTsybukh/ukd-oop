import java.util.*;
import java.util.stream.Collectors;

public class FormAnalytics {
    private final ArrayList<Form> forms;

    public FormAnalytics(ArrayList<Form> forms) {
        if(forms == null) {
            throw new IllegalArgumentException("The list of forms cant be null.");
        }
        this.forms = new ArrayList<>(forms);
    }

    public int getTotalFormsCount() {
        return forms.size();
    }

    public int getCountByBirthYear(int year) {
        return (int) forms.stream()
                .filter(form -> form.getBirthYear() == year)
                .count();
    }
    public double getAverageAge() {
        return forms.stream()
                .mapToInt(Form::getBirthYear)
                .average()
                .orElse(0.0);
    }

    public double getAverageSalary() {
        return forms.stream()
                .mapToDouble(Form::getSalary)
                .average()
                .orElse(0.0);
    }

    public List<String> getHighEarners() {
        double threshold = getAverageSalary() * 1.10;
        return forms.stream()
                .filter(f -> f.getSalary() > threshold)
                .map(Form::getName)
                .collect(Collectors.toList());
    }
    public void printTop3Hobbies() {
        forms.stream()
                .collect(Collectors.groupingBy(f -> f.getHobby().toLowerCase(), Collectors.counting()))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " - " + e.getValue() + " times"));
    }

    public int getMarriedCount() {
        return (int) forms.stream()
                .filter(Form::isMarried)
                .count();
    }

    public List<Form> getSortedByAge() {
        return forms.stream()
                .sorted(Comparator.comparingInt(Form::getBirthYear).reversed())
                .collect(Collectors.toList());
    }

    public List<Form> getSortedByName() {
        return forms.stream()
                .sorted(Comparator.comparing(Form::getName))
                .collect(Collectors.toList());
    }
}
