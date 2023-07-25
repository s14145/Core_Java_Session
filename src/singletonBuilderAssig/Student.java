package singletonBuilderAssig;

/**
 * This class is a Student Singleton class
 *
 */
public class Student implements Cloneable{

    // private static instance of Student type using lazy initialization
    private static Student student = null;

    private Student() {
        // This check prevents reflection API to break singleton design pattern
        if(student != null){
            throw new RuntimeException("Singleton Design Pattern");
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

    public static void main(String[] args) {

        // Hashcode of both student1 and student2 objects is same so Student class is a Singleton class
        Student student1 = Student.getInstance();
        System.out.println("Hashcode of Student1 Object: " + student1.hashCode());
        Student student2 = Student.getInstance();
        System.out.println("Hashcode of Student2 Object: " + student2.hashCode());

    }
}