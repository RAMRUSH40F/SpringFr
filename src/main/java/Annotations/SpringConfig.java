package Annotations;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("Annotations")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
