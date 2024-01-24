package constructor;

public class Employee extends Person{


        // Additional instance variable in the child class
        private int employeeId;

        // Constructor to initialize both instance variables
        public Employee(String name, int employeeId) {
            // Call the constructor of the parent class to initialize the 'name' variable
            super(name);
            this.employeeId = employeeId;
        }

        // Overloaded constructor to initialize only the 'employeeId' variable
        public Employee(int employeeId) {
            // Assuming a default name for employees without explicitly providing 'name'
            super("Default Employee name");
            this.employeeId = employeeId;
        }

        // Getter method for the employeeId
        public int getEmployeeId() {
            return employeeId;
        }
}
