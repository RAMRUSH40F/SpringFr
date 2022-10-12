package XML;
public class RockMusic implements Music
{
    public void doMyinit(){
        System.out.println("Doing my initialization");
    }

    public void doMyDestroy(){
        System.out.println("Doing my destroy");
    }


    @Override
    public String getSong() {
        return "Caddillac";
    }
}
