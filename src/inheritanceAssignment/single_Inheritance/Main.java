package inheritanceAssignment.single_Inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog(4,true,"Tommy","German Sherpard","5 feet");
        System.out.println("Dog Information: \nNumber of Legs = " + dog1.getNoOfLegs() + "\nHousehold = " + dog1.isHousehold() + "\nName = " +
                dog1.getName() + "\nDog Type  = " + dog1.getType() + "\nDog Height = " + dog1.getHeight());

        // Overiding method
        dog1.makeSound();
        }
    }

