package stringAssignment;

import java.util.Scanner;

public class OddCharacterUsingRepeatAssign {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter number only: ");
            int enteredNumber = scanner.nextInt();
            StringBuilder stringBuilder = new StringBuilder();
            if(enteredNumber == 1){
                stringBuilder.append("a");
            }else if(enteredNumber % 2 == 0) {
                stringBuilder.append("b");
                stringBuilder.append("a".repeat(enteredNumber - 1));
            }else{
                stringBuilder.append("a".repeat(enteredNumber));
            }
            System.out.println("The string with odd number of characters are: " + stringBuilder.toString());
        }catch (Exception ex){
            System.out.println("Invalid input. Please enter number only!");
            ex.printStackTrace();
        }
    }
}