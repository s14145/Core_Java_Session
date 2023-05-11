package immutableAssignment;


/**
 *  User class is not immutable as class is not final,
 *  data members are not final.
 *
 */
public class User {

    private int height;

    private int weight;

    /**
     * Parameterized constructor
     *
     */
    public User(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    /**
     *  This is a getter method.
     *
     * @return String The height of user
     */
    public int getHeight() {
        return height;
    }

    /**
     *  This is a getter method.
     *
     * @return String The weight of user
     */
    public int getWeight() {
        return weight;
    }
}