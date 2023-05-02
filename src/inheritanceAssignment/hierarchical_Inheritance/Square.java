package inheritanceAssignment.hierarchical_Inheritance;

public class Square extends Shape{

    // Default Constructor
    public Square() {
    }

    // Parameterized Constructor
    public Square(int length) {
        super(length);
    }

    // Overiding method
    @Override
    public void calculateArea() {
        double area = getLength() * getLength();
        System.out.println("Area of Square : " + area);
    }
}
