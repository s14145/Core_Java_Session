package inheritanceAssignment.hybrid_Inhertance;

public class Honda extends Car{

    // Default Constructor
    public Honda() {
    }

    // Parameterized Constructor
    public Honda(String make, String model, int year, String color) {
        super(make, model, year, color);
    }
}
