package hu.gyakorlas07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LakeConfiguration {

    public LakeConfiguration(){
        System.out.println("Tó létrejön");
    }

    @Bean
    public Lake lake(){
        return new Lake();
    }


}
