package it.ifoa.progettoblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import it.ifoa.progettoblog.models.Author;
import it.ifoa.progettoblog.models.Post;
import it.ifoa.progettoblog.repositories.AuthorRepository;

// @Controller
@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    // @RequestMapping(method=RequestMethod.GET)
    // public @ResponseBody List<Author> getAllAuthor(){
    @GetMapping
    public List<Author> getAllAuthor(){
        return authorRepository.findAll();
    }

    // @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @GetMapping("{id}")
    // public @ResponseBody Author getAuthor(@PathVariable("id") Long id){
    public Author getAuthor(@PathVariable("id") Long id){
        return authorRepository.findById(id).get();
    }

    @PostMapping
    public Author saveAuthor(@RequestBody Author author){
        return authorRepository.save(author);
    }

    @PutMapping("{id}")
    public Author updateAuthor(@PathVariable("id") Long id, @RequestBody Author author){
        author.setId(id);
        return authorRepository.save(author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id") Long id){
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
