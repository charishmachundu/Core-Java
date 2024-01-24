package Conditions;

public class Age {
    public static void main(String[] args){
        int age =15;

        if(age <= 13){
            System.out.println("Child");
        }
       else if(age>=13 && age<=19){
            System.out.println("Teen");
        }
        else {
            System.out.println("Adult");
        }
    }
}
