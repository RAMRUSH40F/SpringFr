package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private int         id;
    private MusicPlayer musicPlayer;

    @Autowired
    public Car(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }
    public void playMusic(){
        System.out.println(musicPlayer.getVolume());
        System.out.println(musicPlayer.playMusic(MusicEnum.CLASSICAL));
    }

}
