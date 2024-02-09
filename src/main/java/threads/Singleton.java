package threads;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
        // Private constructor to prevent instantiation outside of the class
    }

    public static synchronized Singleton getInstance() {
        // Synchronized method to make it thread-safe
        if (instance == null) {
            // Create the instance if it doesn't exist yet
            instance = new Singleton();
        }
        return instance;
    }

    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }

    public static void main(String[] args) {
        // Using the singleton instance
        Singleton singleton1 = Singleton.getInstance();
        singleton1.doSomething();

        Singleton singleton2 = Singleton.getInstance();

        // Check if both references point to the same instance
        if (singleton1 == singleton2) {
            System.out.println("Both references point to the same singleton instance.");
        } else {
            System.out.println("References do not point to the same instance. This should not happen in a proper singleton.");
        }
    }
}
