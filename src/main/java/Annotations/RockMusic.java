package Annotations;

import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusic")
public class RockMusic implements Music
{
    @PostConstruct
    public void doMyinit(){
        System.out.println("Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Doing my destroyment");
    }


    @Override
    public String getSong() {
        return "Caddillac";
    }
}
