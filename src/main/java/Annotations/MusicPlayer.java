package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope()
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;
    private final Music music1;
    private final Music music2;

    public String getName()
    {
        return name;
    }

    public int getVolume()
    {
        return volume;
    }

    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("classicalMusic") Music music2)
    {
        this.music2 = music2;
        this.music1 = music1;
    }

    public String playMusic() {
        System.out.println("Playing: " + music1.getSong());
        System.out.println("Playing: " + music2.getSong());
        return "Playing: " + music1.getSong()+", "+ music2.getSong();

        }
}
