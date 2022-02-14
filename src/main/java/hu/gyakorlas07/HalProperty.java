package hu.gyakorlas07;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;


//@PropertySource(Classpath:application.properties)
@ConfigurationProperties(prefix = "fish")
@PropertySource(value = "classpath:aplication.properties", encoding = "UTF-8")
public class HalProperty {
    private @Getter @Setter int size;

}
