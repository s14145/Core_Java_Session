package inheritanceAssignment.hierarchical_Inheritance;

public abstract class Shape {

    // States
    private int length;

    private int width;

    // Default Constructor
    public Shape() {
    }

    // Parameterized Constructor

    public Shape(int length) {
        this.length = length;
    }

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }



    // Getters and Setters
    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Overided method
    public abstract void calculateArea();
}
