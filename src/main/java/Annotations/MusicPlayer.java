package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Random;

@Component
@Scope()
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;


    private final Music rockMusic;
    private final ClassicalMusic classics;
    private final PopMusic popMusic;

    public String getName()
    {
        return name;
    }

    public int getVolume()
    {
        return volume;
    }
    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, ClassicalMusic classics, PopMusic popMusic)
    {
        this.classics = classics;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public String playMusic(Enum MusicEnum) {
        if (MusicEnum.name().equals("POP")){
            String randomTrack = popMusic.getSongList()[new Random().nextInt(popMusic.getSongList().length)];
            return randomTrack;
        }
        else{
            String randomTrack = classics.getSongList()[new Random().nextInt(classics.getSongList().length)];
            return randomTrack;
        }

    }

}
