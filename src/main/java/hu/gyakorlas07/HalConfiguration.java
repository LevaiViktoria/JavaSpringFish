package hu.gyakorlas07;

import org.springframework.context.annotation.Configuration;

@Configuration
public class HalConfiguration {

    Hal hal(){
        return new Hal(2);
    }
}
