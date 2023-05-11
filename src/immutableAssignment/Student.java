package immutableAssignment;


/**
 *
 *  Immutable class is a class whose content cannot be changed once object created. For eg: String class, DateTimeFormatter class, etc.
 *  Custom immutable class can be created by:
 *  1. Making class final so that it cannot be extended by any other class.
 *  2. Making data members private and final so that data member's value cannot be changed after object is created.
 *  3. Class should have only getter method but no any setter method.
 *
 */
public final class Student {

    // private and final data member
    private final String name;

    /**
     *  Parameterized constructor
     *
     */
    public Student(String name) {
        this.name = name;
    }

    // Getter Method

    /**
     *  This is a getter method.
     *
     * @return String The name of student
     */
    public String getName() {
        return name;
    }
}