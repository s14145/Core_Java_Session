package immutableAssignment;


/**
 *  User class is not immutable as class is not final,
 *  data members are not final.
 *
 */
public class User {

    private int height;

    private int weight;

    public User(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }
}