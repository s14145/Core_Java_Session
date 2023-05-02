package inheritanceAssignment.hybrid_Inhertance;

public class Toyota extends Car{

    // Default Constructor
    public Toyota() {
    }

    // Parameterized Constructor
    public Toyota(String make, String model, int year, String color) {
        super(make, model, year, color);
    }
}
