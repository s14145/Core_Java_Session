package inheritanceAssignment.multi_Level_Inheritance;

public class Child extends Father{

    // States
    private String weight;

    // Default Constructor
    public Child() {
        super();
    }
    // Parameterized Constructor
    public Child(String name, int age, boolean isMarried, String weight) {
        super(name,age,isMarried);
        this.weight = weight;
    }

    // Getters and Setters
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
