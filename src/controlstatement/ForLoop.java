package controlstatement;


import java.util.SplittableRandom;

/**
 *  This class is used to demonstrate For Loop
 *
 */
public class ForLoop {

    /**
     *  This static method is used to generate OTP
     *
     * @param number  This is length of OTP
     * @return String This return OTP String value
     */
    public static String generateOTP(int number) {

        SplittableRandom splittableRandom = new SplittableRandom();
        StringBuilder stringBuilder = new StringBuilder();
        // Using For Loop
        for (int i = 0; i < number; i++) {
            stringBuilder.append(splittableRandom.nextInt(0, 9));
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println("Your OTP is: " + generateOTP(5));
    }
}