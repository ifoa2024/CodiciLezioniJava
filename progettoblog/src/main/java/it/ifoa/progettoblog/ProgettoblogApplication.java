package it.ifoa.progettoblog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import it.ifoa.progettoblog.dtos.AuthorDto;
import it.ifoa.progettoblog.models.Author;
import it.ifoa.progettoblog.utils.mappings.AuthorToAuthorDtoPropertyMap;

@SpringBootApplication
public class ProgettoblogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoblogApplication.class, args);
	}

	@Bean
	public ModelMapper instanceModelMapper(){
		ModelMapper mapper = new ModelMapper();
		mapper.addMappings(new AuthorToAuthorDtoPropertyMap());
		return mapper;
	}

}
