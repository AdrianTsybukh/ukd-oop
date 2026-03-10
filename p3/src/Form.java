public class Form {
    private final String name;
    private final int birthYear;
    private final String hobby;
    private final boolean isMarried;
    private final double salary;

    public Form(String name, int birthYear, String hobby, boolean isMarried, double salary) {
        this.name = name;
        this.birthYear = birthYear;
        this.hobby = hobby;
        this.isMarried = isMarried;
        this.salary = salary;
    }

    public void aboutMyself() {
        System.out.printf("""
                Name: %s
                Year of birth: %d
                Hobby: %s
                Is married: %b
                Salary: %f
                
                """, this.name, this.birthYear, this.hobby, this.isMarried, this.salary);
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getHobby() {
        return hobby;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public double getSalary() {
        return salary;
    }
}
