import overlapping.Vehicle;
import overlapping.VehicleType;
import wielo_aspektowe.Employee;
import wielo_aspektowe.Gender;
import wielo_aspektowe.Human;
import wielodziedziczenie.Animal;
import wielodziedziczenie.Eagle;
import wielodziedziczenie.Flyable;
import klasa_abstrakcyjna_polimorfizm.Person;
import klasa_abstrakcyjna_polimorfizm.Student;

import java.util.EnumSet;

public class Main {
    public static void main(String[] args) {
        //polimorfizm
        printHeader("polimorfizm");
        Person person = new Student();
        person.printSmt();

        //wielodziedziczenie
        Flyable eagle = new Eagle();
        Animal eagle2 = new Eagle();

        //Overlapping
        printHeader("Overlapping");
        Vehicle yellowSubmarine = new Vehicle("yellow submarine", EnumSet.of(VehicleType.Submarine));
        try {
            yellowSubmarine.setMaxUnderwaterDepth(4000d);
            yellowSubmarine.setMaximumAltitudeInAir(7000d);
        } catch (Exception e) {
            printErrHeader("error : Overlapping");
            System.err.println("just a submarine: " + e.getMessage());
        }
        Vehicle flyingSubmarine = new Vehicle("flyingSubmarine", EnumSet.of(VehicleType.Submarine, VehicleType.Plane));
        try {
            flyingSubmarine.setMaxUnderwaterDepth(4000d);
            flyingSubmarine.setMaximumAltitudeInAir(7000d);
            System.out.println("flying submarine works");
        } catch (Exception e) {
            printErrHeader("error : Overlapping");
            System.err.println("flyingSubmarine: " + e.getMessage());
        }

        //Wieloaspektowe
        printHeader("Wieloaspektowe");
        Employee empMale = new Employee("Adam", "Małysz", Gender.MALE, 1234); // Emp + Male
        Human justFemale = new Human("Adam", "Małysz", Gender.MALE);                //Female
        Employee justEmp = new Employee("Adam", "Małysz",1234);                //Emp
        try{
            empMale.maleMethod();
            System.out.println("salary:\t" + empMale.getSalary());
            empMale.femaleMethod();
        }catch (Exception e){
            printErrHeader("error : Wieloaspektowe");
            System.err.println("Male Employee using female method:"  + e.getMessage());
        }

    }
    static void printHeader(String src){
        System.out.println();
        System.out.println("\t\t\t" + src);
    }
    static  void printErrHeader(String src){
        System.err.println("\t\t\t" + src);
    }
}