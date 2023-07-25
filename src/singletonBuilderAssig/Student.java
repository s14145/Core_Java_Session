package singletonBuilderAssig;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * This class is a Student Singleton class
 *
 */
public class Student implements Cloneable, Serializable{

    // private static instance of Student type using lazy initialization
    private static Student student = null;

    private Student() {
        // This check prevents reflection API to break singleton design pattern
        if(student != null){
            throw new RuntimeException("Singleton Design Pattern Error");
        }
    }

    /**
     * This is a static method that returns Student Singleton class
     *
     * @return Student Singleton class
     */
    public static Student getInstance(){
        if(student == null){
            // Using class level locking to make it thread safe for multithreaded environment
            synchronized (Student.class){
                if(student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }

    /**
     * This non-static method prevents violating singleton design pattern using deserialization
     *
     * @return Object Singleton class
     */
    public Object readResolve(){
        return student;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // We can also throw exception here to prevent violation of Singleton design pattern
        return student;
    }

    /* Imp Notes: Three ways to break Singleton design pattern
     * 1. Using Reflection API ( Solutions 1. If singleton instance exists then throw exception from inside of private constructor 2. Using Enum)
     * 2. Deserialization (Solution 1. Implement readResolve method)
     * 3. Cloning (Solution 1. Throw exception or return instance of Singleton class in clone method)
     */

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        // Hashcode of both student1 and student2 objects is same so Student class is a Singleton class
        Student student1 = getInstance();
        System.out.println("Hashcode of Student1 Object: " + student1.hashCode());
        Student student2 = getInstance();
        System.out.println("Hashcode of Student2 Object: " + student2.hashCode());

        System.out.println("##################################################################");

        // Serialization & Deserialization: Hashcode of both  student3 and student4 objects is same
        System.out.println("Serialization & Deserialization:");
        Student student3 = getInstance();
        System.out.println("Hashcode of Student3 Object: " + student3.hashCode());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.txt"));
        oos.writeObject(student3);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.txt"));
        Student student4 = (Student) ois.readObject();
        System.out.println("Hashcode of Student4 Object: " + student4.hashCode());

        System.out.println("##################################################################");

        // Cloning: Hashcode of both student5 and student6 is same
        System.out.println("Cloning:");
        Student student5 = getInstance();
        System.out.println("Hashcode of Student5 Object: " + student5.hashCode());
        Student student6 = (Student) student5.clone();
        System.out.println("Hashcode of Student6 Object: " + student6.hashCode());

        System.out.println("##################################################################");

        // Reflection API : Error is thrown as it is violating Singleton design pattern which is expected
        System.out.println("Reflection API:");
        Constructor<Student> declaredConstructor = Student.class.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        Student student7 = declaredConstructor.newInstance();
        System.out.println("Hashcode of Student7 Object: " + student7.hashCode());
    }
}