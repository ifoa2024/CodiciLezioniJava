package it.ifoa.progettoblog.services;

import java.util.List;

import it.ifoa.progettoblog.dtos.AuthorDto;
import it.ifoa.progettoblog.models.Author;

public interface AuthorService {
    List<AuthorDto> readAll();
    AuthorDto read(Long id);
    List<AuthorDto> read(String email);
    List<AuthorDto> read(String firstname, String lastname);
    AuthorDto create(Author author);
    AuthorDto update(Long id, Author author);
    void delete(Long id);
}
