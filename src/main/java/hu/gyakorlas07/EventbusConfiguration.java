package hu.gyakorlas07;

import com.google.common.eventbus.EventBus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//A futtatói környezetből tud adatokat felvenni,
@Configuration
public class EventbusConfiguration {

    public EventbusConfiguration(){
        System.out.println("Eventbus létrejön");
    }

    //A Bean egy olyan osztály amit én menet közben fogok létrehozni, a környezet ezt később regisztrálja.
    @Bean
    public EventBus eventbus() {
        return new EventBus();
    }

}
