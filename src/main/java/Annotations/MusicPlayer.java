package Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name:Undefined}")
    private String name;
    @Value("${musicPlayer.volume:50}")
    private int    volume;

    private final Music          rockMusic;
    private final ClassicalMusic classics;
    private final PopMusic       popMusic;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music rockMusic, ClassicalMusic classics, PopMusic popMusic) {
        this.classics = classics;
        this.rockMusic = rockMusic;
        this.popMusic = popMusic;
    }

    public String playMusic(Enum MusicEnum) {
        String randomTrack;
        if (MusicEnum.name().equals("POP")) {
            randomTrack = popMusic.getSongList()[new Random().nextInt(popMusic.getSongList().length)];
        } else {
            randomTrack = classics.getSongList()[new Random().nextInt(classics.getSongList().length)];
        }
        return randomTrack;

    }

}
