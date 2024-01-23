class Whatsapp {

    void messages(){
        System.out.println("Sending normal whatsapp messages");
    }
}

class WhatsappVersion1 extends Whatsapp{

    void messages(){
        System.out.println("Sending normal messages and Group messages");
    }
}

class WhatsappVersion2 extends Whatsapp{

    void messages(){
        System.out.println("Sending messages with stickers and emojis");
    }
}

public class RuntimePolymorphism{

    public static void main(String[] args){
        // Creating an object of the parent class
        Whatsapp whatsapp = new Whatsapp();
        whatsapp.messages(); // Calling the message method of the parent class

        // Creating an object of the child class
        Whatsapp version1 = new WhatsappVersion1();
        version1.messages(); // Calling the message method of the child class

        // Creating an object of the child class
        Whatsapp version2 = new WhatsappVersion2();
        version2.messages(); // Calling the message method of the child class
    }

}