package it.ifoa.progettoblog;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import it.ifoa.progettoblog.models.Author;
import it.ifoa.progettoblog.repositories.AuthorRepository;

// @SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class ProgettoblogApplicationTests {

	@Autowired
	AuthorRepository authorRepository;

	@BeforeEach
    void load(){
        Author a1 = new Author();
        a1.setName("Giuseppe");
        a1.setSurname("Verdi");
		a1.setEmail("VerdiG@test.it");
        authorRepository.save(a1);
    }

	// @Test
	// void contextLoads() {
	// }

	@Test
	void findByNameTest() {
		assertThat(authorRepository.findByName("Giuseppe")).extracting("name").containsOnly("Giuseppe");
	}

	@Test
    void sameNameAuthor(){
        assertThat(authorRepository.authorsWithName())
            .extracting("name")
            .containsOnly("Giuseppe");
    }

	@Test
    void sameNameAuthorNonNative(){
        assertThat(authorRepository.authorsWithNameNonNative())
            .extracting("name")
            .containsOnly("Giuseppe");
    }

}
