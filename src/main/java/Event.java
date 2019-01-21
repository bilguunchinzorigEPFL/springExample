import org.springframework.context.ApplicationEvent;

/**
 * Created by beku on 1/10/2019.
 */
public class Event extends ApplicationEvent{

    public Event(Object source) {
        super(source);
    }

    public String getMessage(){
        return "msgFromEvent";
    }
}
