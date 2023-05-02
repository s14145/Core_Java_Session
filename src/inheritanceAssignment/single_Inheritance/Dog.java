package inheritanceAssignment.single_Inheritance;

public class Dog extends Animal{

    // Dog Specific states
    private String name;
    private String type;
    private String height;

    // Default Constructor
    public Dog() {
        super();
    }

    // Parameterized Constructor
    public Dog(int noOfLegs, boolean isHousehold, String name, String type, String height) {
        super(noOfLegs,isHousehold);
        this.name = name;
        this.type = type;
        this.height = height;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    // Overriding parent class(Animal) behavior
    @Override
    public void makeSound() {
        System.out.println("Dog Bark");
    }

}
