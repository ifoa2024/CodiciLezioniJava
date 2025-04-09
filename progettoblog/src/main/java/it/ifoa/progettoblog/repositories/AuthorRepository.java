package it.ifoa.progettoblog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import it.ifoa.progettoblog.models.Author;

public interface AuthorRepository extends CrudRepository<Author,Long>{
    //Derived query
    List<Author> findByName(String firstname);
    List<Author> findBySurname(String lastname);
    List<Author> findByNameAndSurname(String firstname, String lastname);
    List<Author> findByEmail(String email);

    //Query Native
    @Query(value = "SELECT * FROM authors a WHERE a.firstname = 'Giuseppe'", nativeQuery = true)
    List<Author> authorsWithName();
    //Query non native
    @Query(value = "SELECT a FROM Author a WHERE a.name= 'Giuseppe'")
    List<Author> authorsWithNameNonNative();
}
