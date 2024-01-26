package employee;

public final class Employee {

        // Final variable representing the total number of employees
        final int noOfEmployees = 50;

        // Final method to generate a unique employee ID
        final String EmployeeId(String firstName, String lastName)
        {
            // Logic to generate a unique employee ID
            String employeeId = firstName.substring(0, 2) + lastName.substring(0, 2) + noOfEmployees;
            return employeeId;
        }
}
