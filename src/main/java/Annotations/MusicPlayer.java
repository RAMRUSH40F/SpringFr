package Annotations;

import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.Collection;


public class MusicPlayer {

    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing: " + music.getSong());
    }
}
