package XML;
public class PopMusic implements Music
{
    private String name = "Despacito";

    public void setName(String name) {
        this.name = name;
    }

    @Override

    public String getSong() {
        return name;
    }
}
