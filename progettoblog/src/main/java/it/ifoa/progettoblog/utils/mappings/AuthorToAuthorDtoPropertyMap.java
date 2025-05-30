package it.ifoa.progettoblog.utils.mappings;

import org.modelmapper.PropertyMap;

import it.ifoa.progettoblog.dtos.AuthorDto;
import it.ifoa.progettoblog.models.Author;

public class AuthorToAuthorDtoPropertyMap extends PropertyMap<Author, AuthorDto> {

    @Override
    protected void configure() {
        map(source.getFullname()).setFullname(null);
        using(new CollectionToIntegerConverter()).map(source.getPosts()).setNumberOfPosts(null);
    }

}
