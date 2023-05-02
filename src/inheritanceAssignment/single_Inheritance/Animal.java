package inheritanceAssignment.single_Inheritance;


public abstract class Animal {

    // States
    private int noOfLegs;

    private boolean isHousehold;

    // Default Constructor
    public Animal() {
    }

    // Parameterized Constructor
    public Animal(int noOfLegs, boolean isHousehold) {
        this.noOfLegs = noOfLegs;
        this.isHousehold = isHousehold;
    }

    // Getters and Setters
    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isHousehold() {
        return isHousehold;
    }

    public void setHousehold(boolean household) {
        isHousehold = household;
    }

    // Behaviors
    public abstract void makeSound();


}
