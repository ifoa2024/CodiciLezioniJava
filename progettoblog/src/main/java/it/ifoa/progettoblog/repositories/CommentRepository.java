package it.ifoa.progettoblog.repositories;

import org.springframework.data.repository.ListCrudRepository;

import it.ifoa.progettoblog.models.Comment;

public interface CommentRepository extends ListCrudRepository<Comment,Long>{

}
