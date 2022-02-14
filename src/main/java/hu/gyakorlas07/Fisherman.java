package hu.gyakorlas07;

import com.google.common.eventbus.EventBus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Fisherman {

    private EventBus eventbus;

    @Autowired
    public void setEventbus(EventBus eventbus) {
        this.eventbus = eventbus;
    }

    @PostConstruct //A registerben azt rakom bele akit majd regisztrálni szeretnék, a postban elfogom tudni küldeni az eseményt
    public void catchFishEvent(){
        this.eventbus.register(this);
    }

}
