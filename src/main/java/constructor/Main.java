package constructor;

public class Main {

        public static void main(String[] args) {
            // Create an Employee with both variables initialized
            Employee e1 = new Employee("Charishma Chundu", 11);
            System.out.println("Employee Name: " + e1.getName());
            System.out.println("Employee ID: " + e1.getEmployeeId());

            // Create an Employee with only employeeId initialized
            Employee e2 = new Employee(12);
            System.out.println("Employee Name: " + e2.getName());  // Default name
            System.out.println("Employee ID: " + e2.getEmployeeId());
        }
}
