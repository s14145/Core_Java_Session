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
     * @return int[] This returns int array
     */
    public static int[] deleteElementFromArray(int[] arr){
        int[] new_arr = new int[arr.length - 1];

        // Delete element 5 from array
        int deleteElement = 5;
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

    public static void main(String[] args) {

        // Approach 1 Traversing array element using Enhanced for-loop
        System.out.println(Arrays.toString(deleteElementFromArray(new int[] {1,2,3,4,5,6})));
        System.out.println("##################################################");

        // Approach 2 Java 8 Stream API filter method
        int[] arr = new int[]{2,4,6,8};
        // Delete element 4 from array
        int[] new_array = Arrays.stream(arr).filter(x -> x != 4).toArray();
        System.out.println(Arrays.toString(new_array));
    }
}