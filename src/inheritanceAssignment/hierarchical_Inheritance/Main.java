package inheritanceAssignment.hierarchical_Inheritance;

public class Main {

    public static void main(String[] args) {
        Shape square = new Square(5);
        square.calculateArea();

        Shape rectangle = new Rectangle(5,6);
        rectangle.calculateArea();

    }
}
