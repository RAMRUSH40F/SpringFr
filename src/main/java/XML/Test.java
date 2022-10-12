package XML;
import Annotations.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args)

    {
        // Спринг прочитал аппликейшн котнтекст, после чего можно вызвать бин
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());



        context.close();
    }
}
