package Annotations;

import org.springframework.stereotype.Component;

@Component
public class Car
{
    private int id;
    private MusicPlayer musicPlayer;

    public Car(MusicPlayer musicPlayer){
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString()
    {
        return "Car " +
                 id +
                " " + musicPlayer.playMusic();
    }
}
