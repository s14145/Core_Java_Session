package immutableAssignment;


import lombok.Value;

/**
 *  Creating custom immutable class by annotating the class with @Value annotation
 *  Note: Lombok and Mutability Detector jars need to be added to the project.
 *  (Lombok is annotation based java library that reduces the boilerplate code in java class)
 *
 */

@Value
public class Employee {

    long employeeId;

    String employeeName;
}