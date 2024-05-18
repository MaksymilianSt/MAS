package klasa_abstrakcyjna_polimorfizm;

public class Student  extends Person {
    private int studentNr;

    @Override
    public void printSmt() {
        System.out.println("from Student");
    }
}
