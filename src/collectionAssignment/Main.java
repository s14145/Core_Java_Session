package collectionAssignment;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        // ArrayList of Student Object
        List<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student(1, "Ram", true);
        Student student2 = new Student(2,"Shyam", true);
        Student student3 = new Student(3,"Sita",false);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        for(Student student: studentArrayList){
            System.out.println(student);
        }

        // Adding duplicate student to the ArrayList
        Student student4 = new Student(1, "Ram", true);
        studentArrayList.add(student4);

        System.out.println("\n");
        System.out.println("After adding duplicate student to ArrayList: ");
        // ArrayList allows adding duplicate student
        for(Student student: studentArrayList) {
            System.out.println(student);
        }

        System.out.println("\n");
        System.out.println("######################################################################");

        // LinkedList of Student Object
        List<Student> studentLinkedList = new LinkedList<>();

        Student student5 = new Student(5, "Dan", true);
        Student student6 = new Student(6,"Tom", true);
        Student student7 = new Student(7,"Mary",false);

        studentLinkedList.add(student5);
        studentLinkedList.add(student6);
        studentLinkedList.add(student7);

        for(Student student: studentLinkedList){
            System.out.println(student);
        }

        // Adding duplicate student to the LinkedList
        Student student8 = new Student(7,"Mary",false);
        studentLinkedList.add(student8);

        System.out.println("\n");
        System.out.println("After adding duplicate student to LinkedList: ");
        // LinkedList allows adding duplicate student
        for(Student student: studentLinkedList) {
            System.out.println(student);
        }

        System.out.println("\n");
        System.out.println("######################################################################");

        //HashSet of Student Object
        Set<Student> hashSet = new HashSet<>();

        Student student9 = new Student(9, "Smith", true);
        Student student10 = new Student(10,"Sam", true);
        Student student11 = new Student(11,"Tina",false);

        hashSet.add(student9);
        hashSet.add(student10);
        hashSet.add(student11);

        for(Student student: hashSet){
            System.out.println(student);
        }

        // Adding duplicate student to the HashSet
        Student student12 = new Student(10,"Sam", true);
        hashSet.add(student12);

        System.out.println("\n");
        System.out.println("After adding duplicate student to HashSet: ");
        // HashSet doesn't allow adding duplicate student
        for(Student student: hashSet) {
            System.out.println(student);
        }

        System.out.println("\n");
        System.out.println("######################################################################");

        //TreeSet of Student Object
        Set<Student> treeSet = new TreeSet<>();

        Student student13 = new Student(13, "Monica", true);
        Student student14 = new Student(14,"Drew", true);
        Student student15 = new Student(15,"Jacob",false);

        treeSet.add(student13);
        treeSet.add(student14);
        treeSet.add(student15);

        for(Student student: treeSet){
            System.out.println(student);
        }

        // Adding duplicate student to the TreeSet
        Student student16 = new Student(13, "Monica", true);
        treeSet.add(student16);

        System.out.println("\n");
        System.out.println("After adding duplicate student to TreeSet: ");
        // TreeSet doesn't allow adding duplicate student
        for(Student student: treeSet) {
            System.out.println(student);
        }
    }
}