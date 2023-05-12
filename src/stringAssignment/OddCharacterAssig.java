package stringAssignment;

import java.util.Scanner;

/**
 *  This class generate string that contain odd number of characters
 *
 *  @author sudhilgauchan
 */
public class OddCharacterAssig {


    public static void main(String[] args) {

        System.out.print("Enter number only: ");
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
           int enteredNumber = scanner.nextInt();
           // Using StringBuilder class which is mutable
            StringBuilder sb = new StringBuilder();
            if(enteredNumber == 1){
                sb.append('a');
            }
            else if(enteredNumber % 2 == 0){
                sb.append("b");
                for(int i = 0; i < enteredNumber - 1; i++){
                    sb.append("a");
                }
            }else{
                for(int i = 0; i < enteredNumber; i++){
                    sb.append("a");
                }
            }
            // Converting StringBuilder to String
            System.out.println("The String with odd number of characters are: " + sb.toString());
        }catch(Exception ex){
            System.out.println("Invalid input!!!. Please enter number only.");
            ex.printStackTrace();
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }
}