package ageCalculation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

/**
 *  This application calculates age based on user input using Date class and SimpleDateFormat class.
 *
 *  @author sudhilgauchan
 */
public class AgeCalcUsingSimpleDateFormat {

    // Conversion of year to milliseconds
    private static final long MILLIS_PER_YEAR = (long) (365 * 24 * 60 * 60 * 1000.0);

    //  Using pattern "yyyy-MM-dd"
    private static final String PATTERN = "yyyy-MM-dd";

    // Using New York TimeZone
    private static final String NEWYORK_TIMEZONE = "America/New_York";

    /**
     *  This static method validates user input date.
     *  Checks for invalid scenarios such as user input Date of Birth is future date or matches current date.
     *
     * @param birthDate the user input date
     * @param currentDate the system current date
     * @return boolean the value true if valid or false otherwise
     */
    private static boolean isValidBirthDate(Date birthDate, Date currentDate) {
        if(birthDate.before(currentDate)){
            return true;
        }else if(birthDate.equals(currentDate)){
            return false;
        } else{
            return false;
        }
    }

    public static void main(String[] args) {

        // Using SimpleDateFormat class
        DateFormat sdf = new SimpleDateFormat(PATTERN);

        // Using TimeZone "America/New_York"
        TimeZone newYorkTimeZone = TimeZone.getTimeZone(NEWYORK_TIMEZONE);
        sdf.setTimeZone(newYorkTimeZone);

        // Prompt user to enter Date of Birth
        System.out.print("Enter Date of Birth in 'YYYY-MM-DD' format: ");

        // Using Scanner class
        Scanner scanner = null;
        try{
            scanner = new Scanner(System.in);
            String enteredBirthDate = scanner.nextLine();
            Date birthDate = sdf.parse(enteredBirthDate);
            // Entered Date of Birth in milliseconds
            long birthDateMillis = birthDate.getTime();

            // Using Date Class for current date
            Date date = new Date();
            Date currentDate = sdf.parse(sdf.format(date));
            // Current date in milliseconds
            long currentDateMills = currentDate.getTime();

            // Subtracting Date of Birth from current date in milliseconds
            long diffMillis = (currentDateMills - birthDateMillis);
            if(isValidBirthDate(birthDate, currentDate)) {

                long year = (long) Math.floor(diffMillis / (MILLIS_PER_YEAR));

                System.out.println("Your age is " + year + " Year(s) old.");
            }else{
                System.out.println("Entered Date of Birth is future date or current date or invalid. Please enter a valid Date of Birth.");
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