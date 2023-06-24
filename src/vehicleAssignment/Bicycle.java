package vehicleAssignment;

public class Bicycle implements IVehicle{

    private int mileage;

    private int numGears;

    public Bicycle() {
    }

    public Bicycle(int mileage, int numGears) {
        this.mileage = mileage;
        this.numGears = numGears;
    }

    @Override
    public double tuneUpCost() {
        return 100;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        if(numPassengers > 0  && numPassengers ==1 ){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "mileage=" + mileage +
                ", numGears=" + numGears +
                '}';
    }
}