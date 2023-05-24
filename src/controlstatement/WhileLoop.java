package controlstatement;

/**
 *  This class is used to demonstrate While Loop
 *
 */
public class WhileLoop {

    /**
     *  This static method is used to reverse number
     *
     * @param number The number to be reversed
     * @return int This returns reverse int
     */
    public static int reverseNumber(int number){
        int remainder;
        int reverse = 0;
        while(number !=  0){
           remainder = number % 10;
           reverse = reverse *  10  + remainder;
           number = number / 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        System.out.println("Reverse number is: " + reverseNumber(1234));
    }
}