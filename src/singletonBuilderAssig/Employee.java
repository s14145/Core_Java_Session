package singletonBuilderAssig;

/**
 * This class is a Employee class
 *
 */
public class Employee {

    private final int employeeId;
    private final String employeeName;

    private final int employeeAge;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.employeeId = employeeBuilder.employeeId;
        this.employeeName = employeeBuilder.employeeName;
        this.employeeAge = employeeBuilder.employeeAge;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAge=" + employeeAge +
                '}';
    }

    /**
     * This class is a static inner EmployeeBuilder class
     */
    static class EmployeeBuilder{

        private int employeeId;
        private String employeeName;

        private int employeeAge;

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setEmployeeId(int employeeId) {
            this.employeeId = employeeId;
            return this;
        }

        public EmployeeBuilder setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
            return this;
        }

        public EmployeeBuilder setEmployeeAge(int employeeAge) {
            this.employeeAge = employeeAge;
            return this;
        }

        public Employee build(){
            Employee employee = new Employee(this);
            return employee;
        }
    }

    public static void main(String[] args) {

        // Creating Employee object with all its 3 properties
        Employee employee1 = new Employee.EmployeeBuilder()
                .setEmployeeId(101)
                .setEmployeeName("Ram")
                .setEmployeeAge(25)
                .build();

        System.out.println(employee1);

        System.out.println("##########################################");

        // Creating Employee object with its 2 properties
        Employee employee2 = new Employee.EmployeeBuilder()
                .setEmployeeId(102)
                .setEmployeeName("Shyam")
                .build();

        System.out.println(employee2);

    }
}