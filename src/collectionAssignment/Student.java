package collectionAssignment;

import java.util.Objects;

public class Student implements Comparable<Student>{

    private int student_Id;
    private String student_Name;

    private Boolean isEnrolled;


    public Student() {
    }

    public Student(int student_Id, String student_Name, Boolean isEnrolled) {
        this.student_Id = student_Id;
        this.student_Name = student_Name;
        this.isEnrolled = isEnrolled;
    }

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }

    public String getStudent_Name() {
        return student_Name;
    }

    public void setStudent_Name(String student_Name) {
        this.student_Name = student_Name;
    }

    public Boolean getEnrolled() {
        return isEnrolled;
    }

    public void setEnrolled(Boolean enrolled) {
        isEnrolled = enrolled;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(student_Id, student.student_Id) && Objects.equals(student_Name, student.student_Name) && Objects.equals(isEnrolled, student.isEnrolled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(student_Id, student_Name, isEnrolled);
    }

    @Override
    public String toString() {
        return "Student{" +
                "student_Id=" + student_Id +
                ", student_Name='" + student_Name + '\'' +
                ", isEnrolled=" + isEnrolled +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if(this.student_Id > student.student_Id){
            return 1;
        }else if(this.student_Id < student.student_Id){
            return -1;
        }else{
            return 0;
        }
    }
}