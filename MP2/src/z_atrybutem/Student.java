package z_atrybutem;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private Set<StudentSubject> subjects = new HashSet<>();
    public int getId() {
        return id;
    }
    public Student(){
        this.id = 0;
        this.name = "z atrubtem";
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void addStudentAso(StudentSubject studentSubject){
        if(!subjects.contains(studentSubject)){
            subjects.add(studentSubject);
        }
    }
    public StudentSubject addSubject(Subject subject){
        return new StudentSubject(this,subject);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
