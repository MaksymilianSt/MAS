import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Employee implements Serializable {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth; //atr zlozony
    private List<String> phoneNumbers; //atr powt.
    private String gender; //atr opcjonalny - getter Optional
    public static int minimalAge = 18; //atr klasowy
    private static Set<Employee> extent = loadExtentFromFile(); //ekstensja + trwalosc

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, List<String> phoneNumbers, String gender) {
        this(firstName, lastName, dateOfBirth, phoneNumbers);
        this.gender = gender;
    }

    public Employee(String firstName, String lastName, LocalDate dateOfBirth, List<String> phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumbers = phoneNumbers;
        addEmployee(this);
    } // przeciazenie

    public Optional<String> getGender() {
        return Optional.ofNullable(this.gender);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {   //atr pochodny
        return new Date().getYear() - dateOfBirth.getYear();
    }

    @Override
    public String toString() { //przesłoniecie
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }

    public static void showExtend() { //metoda klasowa
        System.out.println("\textent of Employees:");
        extent.forEach(System.out::println);
    }

    private static void addEmployee(Employee employee) {
        extent.add(employee);
        saveExtentToFile();
    }

    private static void removeEmployee(Employee employee) {
        extent.remove(employee);
    }
    private static void saveExtentToFile() {
        String filePath = "employees.ser";
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            outputStream.writeObject(extent);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Set<Employee> loadExtentFromFile() {
        String filePath = "employees.ser";
        if (!new File(filePath).exists()) {
            try {
                new File("employees.ser").createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath))) {
           return extent = (Set<Employee>) inputStream.readObject();
        } catch (Exception e) {
        }
        return new HashSet<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName) && Objects.equals(dateOfBirth, employee.dateOfBirth) && Objects.equals(phoneNumbers, employee.phoneNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dateOfBirth, phoneNumbers);
    }
}
