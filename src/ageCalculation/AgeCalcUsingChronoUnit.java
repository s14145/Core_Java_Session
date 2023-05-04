package ageCalculation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.time.temporal.ChronoUnit;

/**
 *  This application calculates age based on custom date using ChronoUnit Enum.
 *
 *  @author sudhilgauchan
 */
public class AgeCalcUsingChronoUnit {

    //  Using pattern "yyyy-MM-dd"
    private static final String PATTERN = "yyyy-MM-dd";

    /**
     *  This static method calculates age comparing custom date (DOB) and system current date using ChronoUnit Enum.
     *
     * @param birthDate the custom date (DOB)
     * @param currentDate the system current date
     * @return nothing
     */
    private static void calculateAge(LocalDate birthDate, LocalDate currentDate) {
        long years = ChronoUnit.YEARS.between(birthDate, currentDate);
        System.out.println("Your age is " + years + " Year(s) old.");
    }

    /**
     *  This static method validates custom date (DOB).
     *  Checks for invalid scenarios such as custom Date of Birth (DOB) is future date or matches current date.
     *
     * @param birthDate the custom date (DOB)
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

        try{
            // Custom Date of Birth
            LocalDate customBirthDate = LocalDate.of(1990,01,22);
            LocalDate birthDate = LocalDate.parse(customBirthDate.toString(), formatter);

            // Using LocalDate class for system current date
            LocalDate date = LocalDate.now();
            LocalDate currentDate = LocalDate.parse(date.toString(), formatter);
            if (isValidBirthDate(birthDate, currentDate)) {
                calculateAge(birthDate, currentDate);
            }else{
                System.out.println("Date of Birth (DOB) is future date or current date or invalid. Please provide valid Date of Birth (DOB).");
            }
        }catch(Exception ex) {
            System.out.println("Date of Birth (DOB) is in invalid format.");
            ex.printStackTrace();
        }
    }
}