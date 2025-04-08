package it.ifoa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import it.ifoa.model.Arm;
import it.ifoa.model.Jeeg;
import it.ifoa.model.Leg;
import it.ifoa.repositories.JeegRepository;

// @Component("jeegService")
@Service("jeegService")
public class JeegServiceImpl implements JeegService {

    @Autowired
    private JeegRepository jeegRepository;

    @Override
    public void attack() {
        if(this.jeegRepository.getJeeg() != null){
            Jeeg jeeg = this.jeegRepository.getJeeg();
            Arm armSx = jeeg.getArmSx();
            Arm armDx = jeeg.getArmDx();
            armSx.attack();
            armDx.attack();
            //System.out.println("Jeeg attacca!");
        }

    }

    @Override
    public void move() {
        if(this.jeegRepository.getJeeg() != null){
            Jeeg jeeg = this.jeegRepository.getJeeg();
            Leg legSx = jeeg.getLegSx();
            Leg legDx = jeeg.getLegDx();
            legSx.walkBackward();
            legDx.walkForward();
            //System.out.println("Jeeg si muove!");
        }

    }

    public JeegRepository getJeegRepository() {
        return jeegRepository;
    }

    public void setJeegRepository(JeegRepository jeegRepository) {
        this.jeegRepository = jeegRepository;
    }

}
