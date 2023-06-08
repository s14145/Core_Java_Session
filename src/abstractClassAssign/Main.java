package abstractClassAssign;

public class Main {

    public static void main(String[] args) {
        Shape rectangleObject = new Rectangle(4,5);
        System.out.println("Perimeter of rectangle is: " + rectangleObject.calculatePerimeter() + " cm");

        System.out.println("################################################");
        Shape squareObject = new Square(4);
        System.out.println("Perimeter of square is: " +  squareObject.calculatePerimeter() + " cm");
    }
}
