package it.ifoa.progettoblog.repositories;

import org.springframework.data.repository.CrudRepository;

import it.ifoa.progettoblog.models.Post;

public interface PostRepository extends CrudRepository<Post,Long>{

}
