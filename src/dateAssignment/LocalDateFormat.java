package dateAssignment;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateFormat {


    public static void main(String[] args) {

        // Using DateTimeFormatter class to format date
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEE MMM dd YYYY");

        // For ZoneId "America/Chicago"
        ZoneId zoneId = ZoneId.of("America/Chicago");
        LocalDate currentDate = LocalDate.now(zoneId);
        System.out.println("Current date for Zone Id 'America/Chicago' is: " + dateTimeFormatter.format(currentDate));

        // For custom date (Expected Date is Tue Aug 23 2022)
        LocalDate customDate = LocalDate.of(2022, Month.AUGUST,23);
        System.out.println("Custom date is: " + dateTimeFormatter.format(customDate));

        // For custom date performing minus days (Expected Date is Wed Jul 05 2023)
        LocalDate customDate1 = LocalDate.of(2023, Month.JULY, 15).minusDays(10);
        System.out.println("Custom date performing minus days is: " + dateTimeFormatter.format(customDate1));

        // For custom date performing plus days (Expected Date is Sat Feb 25 2023)
        LocalDate customDate2 = LocalDate.of(2023, Month.FEBRUARY,20).plusDays(5);
        System.out.println("Custom date performing plus days is: " + dateTimeFormatter.format(customDate2));

    }
}
