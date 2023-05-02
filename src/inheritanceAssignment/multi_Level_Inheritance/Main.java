package inheritanceAssignment.multi_Level_Inheritance;

public class Main {

    public static void main(String[] args) {
        Child child1 = new Child("Hari",22,false, "6 feet");
        System.out.println("Child Information: \nName = " + child1.getName()+ "\nAge= " + child1.getAge() + "\nMarried = " +
                child1.isMarried() + "\nWeight = " + child1.getWeight());
    }
}
