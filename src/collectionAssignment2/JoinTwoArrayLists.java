package collectionAssignment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JoinTwoArrayLists {

    public static void main(String[] args) {

        // First ArrayList
        List<Student> arrayList1 = new ArrayList<>();
        Student student1 = new Student(1,"Tom",true);
        Student student2 = new Student(2,"Hank",false);
        arrayList1.add(student1);
        arrayList1.add(student2);

        // Second ArrayList
        List<Student> arrayList2 = new ArrayList<>();
        Student student3 = new Student(3,"Nita",true);
        Student student4 = new Student(4,"Shriya",false);
        arrayList2.add(student3);
        arrayList2.add(student4);

        arrayList1.addAll(arrayList2);
        System.out.println("Joining Two ArrayLists into one ArrayList: ");
        for(Student student: arrayList1){
            System.out.println(student);
        }
    }
}