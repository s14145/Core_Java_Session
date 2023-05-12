package stringAssignment;

import java.util.Scanner;

/**
 *  This class performs arithmetic operation
 *
 *  @author sudhilgauchan
 */
public class ArithmeticAssignment {

        /**
         *  This static method performs arithmetic operation.
         *  ( if user input number is 123 then 1+2+3= 6;
         *    if user input number 1000 then 1+0+0+0= 1)
         *
         * @param number The user input number
         * @return int The int number after adding individual digits
         */
        public int arithmeticOps(int number){
            int modulus;
            int temp = 0;
            int n = number;
            while(n != 0){
                // Getting modulus
                modulus = n % 10;
                temp += modulus;
                // Getting quotient
                n = n/10;
            }
            return temp;
        }

        public static void main(String[] args) {

            System.out.print("Enter number only: ");

            try(Scanner scanner = new Scanner(System.in)){
                int enteredNum = scanner.nextInt();
                ArithmeticAssignment arithmeticAssignment = new ArithmeticAssignment();
                System.out.println("The output is: " + arithmeticAssignment.arithmeticOps(enteredNum));
            }catch(Exception ex){
                System.out.println("Invalid input!!!. Please enter number only.");
                ex.printStackTrace();
            }
        }
}