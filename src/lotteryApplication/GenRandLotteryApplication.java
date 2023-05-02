package lotteryApplication;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Lottery Application to generate 6 different random numbers in which 5 different random numbers
 * should be smaller than 75 and the last one number should be smaller than 25
 *
 * @author sudhilgauchan
 */
public class GenRandLotteryApplication {

    /**
     * This method is used to generate random numbers using Math.random() method.
     *
     * @param
     * @return List<Integer> This returns list of integer
     */
    public List<Integer> getRandomNumbersUsingMathRandom(){

        // Used Linked List to store generated 6 different random numbers
        List<Integer> randomNumbers = new LinkedList<>();

        // Generating 5 different random numbers smaller than 75
        int min = 0, max = 75, max1 = 25;
        int range = max - min + 1;
        Integer fiveRandomNumbers = 0;

        for(int i = 0; i < 5; i++) {
            fiveRandomNumbers = Integer.valueOf((int) Math.floor(Math.random() * range) + min);
            randomNumbers.add(fiveRandomNumbers);
        }

        // Generating the last one number smaller than 25
        int range1 = max1 - min + 1;
        Integer sixthRandomNumber = Integer.valueOf((int) Math.floor(Math.random() * range1) + min);

        randomNumbers.add(sixthRandomNumber);
        return randomNumbers;
    }

    /**
     * This method is used to generate random numbers using Random class.
     *
     * @param
     * @return int[] This returns int array
     */
    public static int[] getRandomNumbersUsingRandomClass() {
        int min = 0, max = 75, max1 = 25;
        int range = max - min + 1;
        int[] arr = new int[6];
        Random rand = new Random();

        //Generating 5 different random numbers smaller than 75
        for (int i = 0; i < 5; i++) {
            arr[i] = rand.nextInt(range) + min;
        }

        // Generating the last one number smaller than 25
        int range1 = max1 - min + 1;
        arr[5] = rand.nextInt(range1) + min;
        return arr;
    }


    public static void main(String[] args) {

        // Approach 1 using Math.random() method
        GenRandLotteryApplication genRandLotteryApplication = new GenRandLotteryApplication();
        System.out.println("Using Math.random() method:");
        System.out.println("Today's Lottery winning numbers are: " + genRandLotteryApplication.getRandomNumbersUsingMathRandom());

        // Approach 2 using Random class
        System.out.println("#############################################################################################");
        System.out.println("Using Random Class:");
        System.out.println("Today's Lottery winning numbers are: " + Arrays.toString(getRandomNumbersUsingRandomClass()));
    }
}
