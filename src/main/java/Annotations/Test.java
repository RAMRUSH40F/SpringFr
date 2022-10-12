package Annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String[] args)

    {
        // Спринг прочитал аппликейшн котнтекст, после чего можно вызвать бин
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

        PopMusic popMusic = context.getBean("popMusic", PopMusic.class);
        System.out.println(popMusic.getSong());

        MusicPlayer musicPlayer = new MusicPlayer(popMusic);
        musicPlayer.playMusic();

        context.close();
    }
}
