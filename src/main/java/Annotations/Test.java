package Annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test
{
    public static void main(String[] args)

    {
        int b = '0';
        int result = 1/b;
        System.out.println(b);
        System.out.println(result);

        // Спринг прочитал аппликейшн котнтекст, после чего можно вызвать бин
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

//        ClassicalMusic classicalMusic = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

          MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.playMusic(MusicEnum.POP));

        context.close();
    }
}
