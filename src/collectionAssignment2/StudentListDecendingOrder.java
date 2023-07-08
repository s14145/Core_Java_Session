package collectionAssignment2;

import java.util.*;

public class StudentListDecendingOrder {

    public static void main(String[] args) {

        // TreeSet of Student Object
        Set<Student> studentTreeSet = new TreeSet<>();
        Student student1 = new Student(1,"Surya",true);
        Student student2 = new Student(2,"Suraj",false);
        Student student3 = new Student(3,"Ravi",true);
        Student student4 = new Student(4,"Mamta",false);
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        studentTreeSet.add(student4);

        // Changed the logic in CompareTo() method in Student class to sort Student object in descending order based on student_Id field
        for(Student student: studentTreeSet){
            System.out.println(student);
        }

        System.out.println("\n");
        System.out.println("##################################################################");

        // Sort Student object in descending order based on student_Name field using Comparator Interface
        Comparator<Student> studentComparatorBasedOnStudentName =
                (i,j) -> j.getStudent_Name().compareTo(i.getStudent_Name());
        Set<Student> studentTreeSet2 = new TreeSet<>(studentComparatorBasedOnStudentName);
        Student student5 = new Student(5,"Zaid",true);
        Student student6 = new Student(6,"Manish",false);
        Student student7 = new Student(7,"Shruti",true);
        Student student8 = new Student(8,"Abhay",false);
        studentTreeSet2.add(student5);
        studentTreeSet2.add(student6);
        studentTreeSet2.add(student7);
        studentTreeSet2.add(student8);

        for(Student student: studentTreeSet2){
            System.out.println(student);
        }
    }
}