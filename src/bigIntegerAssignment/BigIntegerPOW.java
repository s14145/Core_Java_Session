package bigIntegerAssignment;

import java.math.BigInteger;

public class BigIntegerPOW {

    public static void main(String[] args) {

        int N = 999999999;

        try {
            BigInteger bigInteger = new BigInteger(String.valueOf(N));

            BigInteger result = bigInteger.pow(11);

            System.out.println("BigInteger of power 11 is: " + result);
        }catch(Exception ex){
            System.out.println("Invalid");
            ex.printStackTrace();
        }
    }
}
