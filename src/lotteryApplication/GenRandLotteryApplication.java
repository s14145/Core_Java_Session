package lotteryApplication;

import java.util.LinkedList;
import java.util.List;

/**
 * Lottery Application to generate 6 random numbers
 *
 * @author sudhilgauchan
 */
public class GenRandLotteryApplication {

    /**
     * This method is used to generate random numbers.
     *
     * @param
     * @return List<Integer> This returns list of integer
     */
    public List<Integer> getRandomNumbers(){

        // Used Linked List to store generated 6 random numbers
        List<Integer> randomNumbers = new LinkedList<>();

        // Generating 5 random numbers smaller than 75
        int min = 0;
        int max = 75;
        int range = max - min + 1;
        Integer fiveRandomNumbers = 0;

        for(int i = 0; i < 5; i++) {
            fiveRandomNumbers = Integer.valueOf((int) Math.floor(Math.random() * range) + min);
            randomNumbers.add(fiveRandomNumbers);
        }

        // Generating the last one number smaller than 25
        int max1 = 25;
        int range1 = max1 - min + 1;
        Integer sixthRandomNumber = Integer.valueOf((int) Math.floor(Math.random() * range1) + min);

        randomNumbers.add(sixthRandomNumber);
        return randomNumbers;

    }


    public static void main(String[] args) {

        GenRandLotteryApplication genRandLotteryApplication = new GenRandLotteryApplication();
        System.out.println("Today's Lottery winning numbers are: " + genRandLotteryApplication.getRandomNumbers());

    }
}
