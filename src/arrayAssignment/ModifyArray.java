package arrayAssignment;

import java.util.Arrays;

/**
 *  This class is used to modify array
 *
 * @author sudhilgauchan
 */
public class ModifyArray {

    /**
     * This static method modifies array by deleting element traversing using Enhanced for-loop
     *
     * @param arr The array of int element
     * @param deleteElement The element in array to be deleted
     * @return int[] This returns int array
     */
    public static int[] deleteElementFromArray(int[] arr, int deleteElement){
        int[] new_arr = new int[arr.length - 1];

        int j = 0;
        // Using Enhanced for-loop
        for(int a: arr){
            if(a != deleteElement){
                new_arr[j] = a;
                j++;
            }
        }
        return new_arr;
    }

    /**
     * This static method modifies array by deleting element using Stream API filter method
     *
     * @param arr The array of int element
     * @param deleteElement The element in array to be deleted
     * @return int[] This returns int array
     */
    public static int[] deleteElementFromArrayUsingStream(int[] arr, int deleteElement){
        int[] new_arr = Arrays.stream(arr).filter(x -> x != deleteElement).toArray();
        return new_arr;
    }

    public static void main(String[] args) {

        // Approach 1 Traversing array element using Enhanced for-loop to delete element 5 from array
        System.out.println(Arrays.toString(deleteElementFromArray(new int[] {1,2,3,4,5,6}, 5)));
        System.out.println("##################################################");

        // Approach 2 Java 8 Stream API filter method to delete element 4 from array
        System.out.println(Arrays.toString(deleteElementFromArrayUsingStream(new int[]{2,4,6,8}, 4)));
    }
}