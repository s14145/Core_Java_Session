package vehicleAssignment;

public class Car implements IVehicle{

    private int mileage;

    private int year;

    private int numDoors;

    public Car() {
    }

    public Car(int mileage, int year, int numDoors) {
        this.mileage = mileage;
        this.year = year;
        this.numDoors = numDoors;
    }

    @Override
    public double tuneUpCost() {
        return 500;
    }

    @Override
    public boolean canCarry(int numPassengers) {
        if(numPassengers > 0 &&  numPassengers <= 4){
            return true;
        }
        return false;
    }

    // indicate whether car was built before given year
    public boolean builtBefore(int otherYear) {

        return this.year < otherYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mileage=" + mileage +
                ", year=" + year +
                ", numDoors=" + numDoors +
                '}';
    }
}