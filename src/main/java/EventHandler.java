import org.springframework.context.ApplicationListener;

/**
 * Created by beku on 1/10/2019.
 */
public class EventHandler implements ApplicationListener<Event> {

    public void onApplicationEvent(Event event) {
        System.out.println(event.getMessage());
    }
}
