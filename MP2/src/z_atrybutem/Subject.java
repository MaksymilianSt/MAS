package z_atrybutem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Subject {
    private int id;
    private String name;
    private Set<StudentSubject> students = new HashSet<>();

    public Subject(){
        this.id = 0;
        this.name = "z atrubtem";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void addSubjectAso(StudentSubject studentSubject){
        if(!students.contains(studentSubject)){
            students.add(studentSubject);
        }
    }
    public StudentSubject addStudent(Student student){
        return new StudentSubject(student, this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return id == subject.id && Objects.equals(name, subject.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
