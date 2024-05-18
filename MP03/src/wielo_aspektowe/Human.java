package wielo_aspektowe;

public class Human implements Female, Male {
    private String name;
    private String surname;
    private final Gender gender;

    public Human(String name, String surname, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    public Human(String name, String surname) {
        this(name, surname, Gender.UNKNOWN);
    }

    @Override
    public void femaleMethod() throws IllegalStateException {
    if(gender != Gender.FEMALE) {
        throw new IllegalStateException("This person is not a female");
    }
        System.out.println("Female method");
    }

    @Override
    public void maleMethod() throws IllegalStateException {
        if(gender != Gender.MALE) {
            throw new IllegalStateException("This person is not a male");
        }
        System.out.println("Male method");
    }
}
