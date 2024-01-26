package employee;

public class Main {

    public static void main(String[] args) {
        // Create an instance of Employee Class
        Employee employee = new Employee();

        // Access the final variable, Have to access using the classname
        int totalEmployees = employee.noOfEmployees;
        System.out.println("Total employees in the company: " + totalEmployees);

        // Access the final method to generate an employee ID
        String generatedId = employee.EmployeeId("Charishma", "Chundu");
        System.out.println("Generated Employee ID: " + generatedId);
    }
}
