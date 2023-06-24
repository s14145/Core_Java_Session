package vehicleAssignment;

public class Main {

    public static void main(String[] args) {

        // Using Interface IVehicle
        IVehicle newKidsBike = new Bicycle(0, 1);
        System.out.println(newKidsBike);

        // Using Implementation class Bicycle
        Bicycle newKidsBike1 = new Bicycle(0, 1);
        System.out.println(newKidsBike1);

        IVehicle oldCar = new Car(200000, 1995, 2);
        oldCar.tuneUpCost();
        oldCar.canCarry(5);

        Car oldCar1 = new Car(200000, 1995, 2);
        oldCar1.tuneUpCost();
        oldCar1.canCarry(5);
        oldCar1.builtBefore(1998);
    }
}