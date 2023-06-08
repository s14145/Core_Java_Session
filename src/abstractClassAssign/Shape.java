package abstractClassAssign;

/**
 *  Abstract class is a class which cannot be instantiated.
 *
 */
public abstract class Shape {

    // Abstract method is a method that has abstract keyword in it and it has only method signature but no method body
    public abstract double calculatePerimeter();

    // Concrete method
    public void display(){
        System.out.println("This is concrete method inside of abstract class");
    }
}