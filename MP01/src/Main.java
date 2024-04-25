import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee andrzej = new Employee(
                "andrzej",
                "Kowalski",
                LocalDate.now().minusYears(30),
                List.of("123321123", "000111222"), "chłop"
        );
                Employee anna = new Employee(
                "Anna",
                "Kochanowska",
                LocalDate.now().minusYears(42),
                List.of("99121123", "3801231"), "baba"
        );
        Employee.showExtend();
    }
}