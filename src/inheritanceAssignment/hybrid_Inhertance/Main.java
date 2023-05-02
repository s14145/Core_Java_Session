package inheritanceAssignment.hybrid_Inhertance;

public class Main {

    public static void main(String[] args) {

        Honda honda = new Honda("Honda","Civic",1990,"Black");
        System.out.println("Honda Information: \nMake = " + honda.getMake() + "\nModel = " + honda.getModel() + "\nYear = " +
                honda.getYear() + "\nColor  = " + honda.getColor());

        Toyota toyota = new Toyota("Toyota","Corolla",2010,"Silver");
        System.out.println("Toyota Information: \nMake = " + toyota.getMake() + "\nModel = " + toyota.getModel() + "\nYear = " +
                toyota.getYear() + "\nColor  = " + toyota.getColor());

    }
}
