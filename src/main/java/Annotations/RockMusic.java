package Annotations;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("rockMusic")
public class RockMusic implements Music {

    @PostConstruct
    public void doMyinit() {
        System.out.println("RockMusicClass: Doing my initialization");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("RockMusicClass: Doing my destroyment");
    }

    @Override
    public String getSong() {
        return "Caddillac";
    }
}
