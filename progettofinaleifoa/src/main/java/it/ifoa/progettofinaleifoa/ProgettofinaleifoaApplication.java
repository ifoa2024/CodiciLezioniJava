package it.ifoa.progettofinaleifoa;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProgettofinaleifoaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettofinaleifoaApplication.class, args);
	}

	@Bean
    public ModelMapper instanceModelMapper(){
        ModelMapper mapper = new ModelMapper();
        return mapper;
    }

}
