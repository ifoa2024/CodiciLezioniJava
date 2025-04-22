package it.ifoa.progettoblog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.ifoa.progettoblog.models.Author;
import it.ifoa.progettoblog.models.Post;
import it.ifoa.progettoblog.repositories.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> readAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author read(Long id) {
        return authorRepository.findById(id).get();
    }

    @Override
    public List<Author> read(String email) {
        return authorRepository.findByEmail(email);
    }

    @Override
    public List<Author> read(String firstname, String lastname) {
        if (firstname == null || lastname == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return authorRepository.findByNameAndSurname(firstname, lastname);
    }

    @Override
    public Author create(Author author) {
        if (author.getEmail() == null) throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        return authorRepository.save(author);
    }

    @Override
    public Author update(Long id, Author author) {
        if (authorRepository.existsById(id)) {
            author.setId(id);
            return authorRepository.save(author);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public void delete(Long id) {
        if(authorRepository.existsById(id)){
            Author author = authorRepository.findById(id).get();
            List<Post> authorPosts = author.getPosts();
            for (Post post : authorPosts) {
                post.setAuthor(null);
            }
            authorRepository.deleteById(id);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Author not found");
        }
    }

}
