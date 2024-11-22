// Write a program where the Main class contains a method displayMessage() that prints a message.
//  Create another class and call the displayMessage() method using an object of the Main class.

class Message{

    public void displayMessage(){
        System.out.println("Message");
        
    }

    
}
public class Qno5 {
    public static void main(String[] args) {
    Message message =new Message();

    message.displayMessage()  ;
    }
}
