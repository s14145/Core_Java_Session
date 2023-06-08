package abstractClassAssign;

public class Square extends Shape{

    private final double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}