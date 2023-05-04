package ageCalculation;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 *  This application calculates age based on user input Date Of Birth (DOB) using Period class.
 *
 *  @author sudhilgauchan
 */
public class AgeCalculationUsingPeriod {

    //  Using pattern "yyyy-MM-dd"
    private static final String PATTERN = "yyyy-MM-dd";

    /**
     *  This static method calculates age comparing user input Date Of Birth (DOB) and system current date using Period class.
     *
     * @param birthDate the user input Date Of Birth (DOB)
     * @param currentDate the system current date
     * @return nothing
     */
    private static void calculateAge(LocalDate birthDate, LocalDate currentDate) {
        Period period = Period.between(birthDate, currentDate);
        System.out.println("Your age is " + period.getYears() + " Year(s), " + period.getMonths() + " Month(s), and " + period.getDays() + " day(s) old.");
    }

    /**
     *  This static method validates user input Date Of Birth (DOB).
     *  Checks for invalid scenarios such as user input Date of Birth (DOB) is future date or matches current date.
     *
     * @param birthDate the user input Date Of Birth (DOB)
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

        // Using Scanner class to process user input Date Of Birth (DOB)
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            String enteredBirthDate = scanner.nextLine();
            LocalDate birthDate = LocalDate.parse(enteredBirthDate, formatter);

            // Using LocalDate class for system current date
            LocalDate date = LocalDate.now();
            LocalDate currentDate = LocalDate.parse(date.toString(), formatter);
            if (isValidBirthDate(birthDate,currentDate)) {
                calculateAge(birthDate, currentDate);
            }else{
                System.out.println("Entered Date of Birth (DOB) is future date or current date or invalid date. Please enter a valid Date of Birth (DOB).");
            }
        }catch(Exception ex) {
            System.out.println("Entered Date of Birth (DOB) is in invalid format.");
            ex.printStackTrace();
        }finally {
            // Closing scanner resource to avoid memory leaks
            if(scanner != null){
                scanner.close();
            }
        }
    }
}