import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();
        lol(context);
    }
    public static void lol(ApplicationContext context){
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.setMessage((Message) context.getBean("msgOuter"));
        obj.getMessage();
        obj.getMessages();
        obj.setMessage((Message) context.getBean("msgfromclass"));
        obj.getMessage();
        ((EventPublisher) context.getBean("eventPublisher")).publish();
    }
}
