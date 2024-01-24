package objectarrays;
import java.util.Objects;

public class Person {

        private double height;
        private double weight;
        private String ssn;
        private String phoneNumber;

        // Constructor
        public Person(double height, double weight, String ssn, String phoneNumber) {
            this.height = height;
            this.weight = weight;
            this.ssn = ssn;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters

        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }

        public double getWeight() {
            return weight;
        }
        public void setWeight(double weight) {
            this.weight = weight;
        }

        public String getSsn() {
            return ssn;
        }
        public void setSsn(String ssn) {
            this.ssn = ssn;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        // Override equals method to match objects based on ssn
        @Override
        public boolean equals(Object obj) {
            Person person = (Person) obj;
            return Objects.equals(ssn, person.ssn);
        }

        public static void main(String[] args) {
            Person person1 = new Person(175.5, 70.0, "123-45-6789", "123-456-7890");
            Person person2 = new Person(180.0, 75.5, "987-65-4321", "987-654-3210");
            Person person3 = new Person(165.0, 65.5, "123-45-6789", "555-555-5555");

            // Testing equals method
            System.out.println("person1 equals person2: " + person1.equals(person2));
            System.out.println("person1 equals person3: " + person1.equals(person3));
        }
}
