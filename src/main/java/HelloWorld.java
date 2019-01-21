import java.util.*;

public class HelloWorld{
    private Message message;
    private List messages;

    public void getMessages() {
        for (Object o : messages) {
            System.out.println("List Elements :"+o.toString());
        }
    }

    public void setMessages(List messages) {
        this.messages = messages;
    }

    public void setMessage(Message message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message.getMessage());
    }
}
