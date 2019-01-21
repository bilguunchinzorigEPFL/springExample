import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by beku on 1/9/2019.
 */
@Configuration
public class Config {
    @Bean
    public Message msgfromclass(){
        Message msg=new Message();
        msg.setMessage("msgFromConfigClass");
        return msg;
    }

    @Bean
    public EventPublisher eventPublisher(){
        return new EventPublisher();
    }

    @Bean
    public EventHandler eventHandler(){
        return new EventHandler();
    }
}
