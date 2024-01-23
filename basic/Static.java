package basic;
public class Static {

    static int Variable = 60;

    public static int StaticVariable() {
        return Variable;
    }

    public static void main(String[] args) {

        System.out.println(Static.Variable);

        System.out.println(Static.StaticVariable());
    }
}
