package it.ifoa;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.ifoa.model.Jeeg;
import it.ifoa.services.JeegService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Jeeg jeeg = context.getBean("jeeg", Jeeg.class);
        // System.out.println(jeeg);
        // System.out.println(jeeg.getArmDx());
        // jeeg.getArmSx().attack();
        // jeeg.getArmDx().attack();
        // jeeg.getLegSx().walkForward();
        // jeeg.getLegDx().walkBackward();

        JeegService service = context.getBean("jeegService", JeegService.class);
        service.attack();
        service.move();
    }
}
