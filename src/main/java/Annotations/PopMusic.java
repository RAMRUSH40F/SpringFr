package Annotations;

import org.springframework.stereotype.Component;

@Component("popMusic")
public class PopMusic implements Music
{

    private final String[] list = {"Metallica", "40 miles", "Zavtra Broshu"};
    private String name = "Despacito";

    public void setName(String name) {
        this.name = name;
    }

    public String[] getSongList() {
        return list ;
    }
    @Override

    public String getSong() {
        return name;
    }
}
