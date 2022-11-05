package Annotations;
import org.springframework.stereotype.Component;

@Component("classicalMusic")
public class ClassicalMusic implements Music
{
    private final String[] list = {"Hungarian Rhapsody", "Year Seasons", "Botichelli"};



    @Override
    public String getSong() {
        return "Hungarian Rhapsody" ;
    }
    public String[] getSongList() {
        return list ;
    }

}
