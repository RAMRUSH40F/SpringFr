package XML;
public class ClassicalMusic implements Music
{
    private ClassicalMusic(){}

    public static ClassicalMusic getClassicalMusic(){ return new ClassicalMusic();}
    private void doMyDestroy(){
        System.out.println("Do My destroy");
    }

    public String getSong() {
        return "Hungarian Rhapsody";

    }

}
