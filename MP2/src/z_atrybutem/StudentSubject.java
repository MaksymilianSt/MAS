package z_atrybutem;

import java.util.Objects;

public class StudentSubject {
    private Student student;
    private Subject subject;
    private int grade;
    public StudentSubject(Student student, Subject subject) {
        this.student = student;
        this.subject = subject;
        student.addStudentAso(this);
        subject.addSubjectAso(this);
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public int getGrade(){
        return grade;
    }

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSubject that = (StudentSubject) o;
        return Objects.equals(student, that.student) && Objects.equals(subject, that.subject);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student, subject);
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "student=" + student.getName() +
                ", subject=" + subject.getName() +
                ", grade=" + grade +
                '}';
    }
}
