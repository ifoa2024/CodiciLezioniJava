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

import it.ifoa.progettoblog.dtos.AuthorDto;
import it.ifoa.progettoblog.models.Author;
import it.ifoa.progettoblog.models.Post;
import it.ifoa.progettoblog.repositories.AuthorRepository;
import it.ifoa.progettoblog.services.AuthorService;

// @Controller
@RestController
@RequestMapping("/api/authors")
public class AuthorRestController {

    // @Autowired
    // private AuthorRepository authorRepository;

    @Autowired
    private AuthorService authorService;

    // @RequestMapping(method=RequestMethod.GET)
    // public @ResponseBody List<Author> getAllAuthor(){
    @GetMapping
    public List<AuthorDto> getAllAuthor(){
        return authorService.readAll();
    }

    // @RequestMapping(value="/{id}", method=RequestMethod.GET)
    @GetMapping("{id}")
    // public @ResponseBody Author getAuthor(@PathVariable("id") Long id){
    public AuthorDto getAuthor(@PathVariable("id") Long id){
        return authorService.read(id);
    }

    @PostMapping
    public AuthorDto saveAuthor(@RequestBody Author author){
        return authorService.create(author);
    }

    @PutMapping("{id}")
    public AuthorDto updateAuthor(@PathVariable("id") Long id, @RequestBody Author author){
        return authorService.update(id, author);
    }

    @DeleteMapping("{id}")
    public void deleteAuthor(@PathVariable("id") Long id){
        authorService.delete(id);
    }

}
