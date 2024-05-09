import kompozycja.Building;
import kwalifikowana.Painter;
import kwalifikowana.Painting;
import z_atrybutem.Student;
import z_atrybutem.StudentSubject;
import z_atrybutem.Subject;
import zwykła.Author;
import zwykła.Book;

public class Main {
    public static void main(String[] args) {
        //zwykła
        System.out.println("Asocjacja zwykła");
        Author author = new Author();
        Book book = new Book();
        author.addBook(book);
        System.out.println("\t" + author);
        System.out.println("\t" + book);

        //z atrbutem
        System.out.println("Asocjacja z atrubutem");
        Student student = new Student();
        Subject subject = new Subject();
        StudentSubject studentSubject = student.addSubject(subject);
        studentSubject.setGrade(5);
        System.out.println("\t" + student);
        System.out.println("\t" + subject);

        //kwalifikowana
        System.out.println("Asocjacja kwalifikaowana");
        Painter painter = new Painter();
        Painting painting = new Painting();
        painter.addPainting(painting);
        System.out.println("\t" + painter);
        System.out.println("\t" + painting);

        //kompozycja
        System.out.println("Kompozycja");
        Building building = new Building("Kompozycja");
        Building.Room room = building.createRoom(92);
        System.out.println("\t" + building);
        System.out.println("\t" + room);

    }
}