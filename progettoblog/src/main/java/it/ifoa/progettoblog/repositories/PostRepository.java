package it.ifoa.progettoblog.repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.ifoa.progettoblog.models.Post;

public interface PostRepository extends ListCrudRepository<Post,Long>{

}
