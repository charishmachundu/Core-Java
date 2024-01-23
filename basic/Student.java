public class Student {

    private String name = "Charishma";

    public String getName() {
        return name;
    }

    public static void main(String[] args){
        Student student = new Student();
        System.out.println("Name retured by getName : " + student.getName());
    }
}
