package it.ifoa.progettoblog.repositories;

import org.springframework.data.repository.CrudRepository;

import it.ifoa.progettoblog.models.Comment;

public interface CommentRepository extends CrudRepository<Comment,Long>{

}
