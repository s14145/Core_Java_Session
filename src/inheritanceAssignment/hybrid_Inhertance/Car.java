package inheritanceAssignment.hybrid_Inhertance;

public class Car extends Vehicle{

    // States
    private String color;

    // Default Constructor
    public Car() {
    }

    // Parameterized Constructor
    public Car(String make, String model, int year, String color) {
        super(make, model, year);
        this.color = color;
    }

    // Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
