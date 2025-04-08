package it.ifoa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import it.ifoa.model.Arm;
import it.ifoa.model.Jeeg;
import it.ifoa.model.Leg;

@Configuration
@ComponentScan("it.ifoa")
public class AppConfig {

    //fra parentesi tonde inseriamo il nome che utilizzeremo per richiamare il bean che ci restituirà l'oggetto jeeg
    @Bean(name = "jeeg")
    public Jeeg getJeeg(){
        // System.out.println("Creao un jeeg");

        return new Jeeg(getArmSx(), getArmDx(), getLegSx(), getLegDx());
    }

    @Bean(name = "armSx")
    public Arm getArmSx(){
        // System.out.println("Creao un arm sx");

        return new Arm(Side.SX);
    }

    @Bean(name = "armDx")
    public Arm getArmDx(){
        // System.out.println("Creao un arm dx");

        return new Arm(Side.DX);
    }

    @Bean(name = "legSx")
    public Leg getLegSx(){
        // System.out.println("Creao un leg sx");

        return new Leg(Side.SX);
    }

    @Bean(name = "legDx")
    public Leg getLegDx(){
        // System.out.println("Creao un leg dx");

        return new Leg(Side.DX);
    }
}
