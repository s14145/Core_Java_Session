package inheritanceAssignment.multi_Level_Inheritance;

public class Father extends GrandFather{

    // States
    private boolean isMarried;

    // Default Constructor
    public Father() {
        super();
    }

    // Parameterized Constructor
    public Father(String name, int age, boolean isMarried) {
        super(name,age);
        this.isMarried = isMarried;
    }

    // Getters and Setters
    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
