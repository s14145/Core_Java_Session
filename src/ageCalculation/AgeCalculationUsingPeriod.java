package ageCalculation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *  This application calculates age based on user input using Period class.
 *
 *  @author sudhilgauchan
 */
public class AgeCalculationUsingPeriod {

    //  Using pattern "yyyy-MM-dd"
    private static final String PATTERN = "yyyy-MM-dd";

    /**
     *  This static method calculates age comparing user input date and system current date using Period class.
     *
     * @param birthDate the user input date
     * @param currentDate the system current date
     * @return nothing
     */
    private static void calculateAge(LocalDate birthDate, LocalDate currentDate) {
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Your age is " + period.getYears() + " Year(s), " + period.getMonths() + " Month(s), and " + period.getDays() + " day(s) old.");
    }

    /**
     *  This static method validates user input date.
     *  Checks for invalid scenarios such as user input Date of Birth is future date or matches current date.
     *
     * @param birthDate the user input date
     * @param currentDate the system current date
     * @return boolean the value true if valid or false otherwise
     */
    private static boolean isValidBirthDate(LocalDate birthDate, LocalDate currentDate) {
        if(birthDate.isBefore(currentDate)){
            return true;
        }else if(birthDate.isEqual(currentDate)){
            return false;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        // Using DateTimeFormatter class
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);

        // Prompt user to enter Date of Birth
        System.out.print("Enter Date of Birth in 'YYYY-MM-DD' format: ");

        // Using Scanner class
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            String enteredBirthDate = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(enteredBirthDate, formatter);

            // System current date
            LocalDate date = LocalDate.now();
            LocalDate currentDate = LocalDate.parse(date.toString(), formatter);
            if (isValidBirthDate(birthDate,currentDate)) {
                calculateAge(birthDate, currentDate);
            }else{
                System.out.println("Entered Date of Birth is future date or current date or invalid date. Please enter a valid Date of Birth.");
            }
        }catch(Exception ex) {
            System.out.println("Entered Date of Birth is in invalid format.");
            ex.printStackTrace();
        }finally {
            // Closing scanner resource to avoid memory leaks
            if(scanner != null){
                scanner.close();
            }
        }
    }
}