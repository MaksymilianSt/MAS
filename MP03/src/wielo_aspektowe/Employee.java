package wielo_aspektowe;

public class Employee extends Human {
    private int salary;
    public Employee(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }
    public Employee(String name, String surname,Gender gender, int salary) {
        super(name, surname, gender);
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
}
