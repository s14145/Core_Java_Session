package immutableAssignment;


import lombok.Value;

/**
 *  Creating custom immutable class by annotating class with @Value annotation
 *  Note: Lombok jar needs to be added to the project.
 *  (Lombok is annotation based java library that reduces the boiler plate code in java class)
 *
 */

@Value
public class Employee {

    private long employeeId;

    private String employeeName;
}
