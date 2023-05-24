package controlstatement;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(System.in)){
            int answer = (int) (Math.random() * 10) + 1;
            int enteredNumber = 0;

            // Using Do While Loop
            do{
                System.out.print("Enter guess number between 1 and 10: ");
                enteredNumber = scanner.nextInt();
                if(enteredNumber > answer){
                    System.out.println("Your guess is high");
                }else if(enteredNumber < answer){
                    System.out.println("Your guess is low");
                }
            }while(enteredNumber != answer);

            System.out.println("Your guess is correct");

        }catch(Exception ex){
            System.out.println("Entered value is invalid.");
            ex.printStackTrace();
        }
    }
}