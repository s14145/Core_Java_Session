package inheritanceAssignment.hierarchical_Inheritance;

public class Rectangle extends Shape{

    // Default Constructor
    public Rectangle() {
    }

    // Parameterized Constructor
    public Rectangle(int length, int width) {
        super(length, width);
    }

    // Overiding method
    @Override
    public void calculateArea() {
        double area = getLength() * getWidth();
        System.out.println("Area of Rectangle : " + area);
    }
}
