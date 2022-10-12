package XML;
import java.util.ArrayList;
import java.util.Collection;

public class MusicPlayer {

    private Music music;
    private Collection<Music> musicList = new ArrayList<>();

    private String name;
    private int volume;



    // Пустой конструктор, чтобы КОНТЕКСТ мог создать
    // его без кострктор-арг

    public MusicPlayer()
    {}
//    public MusicPlayer(Music music)
//    {
//        this.music = music;
//    }

    public Collection<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(Collection<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void playMusic()
    {
        for (Music music:getMusicList()){
            System.out.println("Playing: "+music.getSong());
        }


    }
}
