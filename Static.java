public class Static {
    // Static variable
    static int Variable = 50;

    // Static method that returns an int
    public static int StaticVariable() {
        return Variable;
    }

    public static void main(String[] args) {
        // Access the static variable
        System.out.println(Static.Variable);

        // Access the static variable using the static method
        System.out.println(Static.StaticVariable());
    }
}
