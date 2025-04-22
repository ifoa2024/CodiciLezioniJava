package it.ifoa.progettoblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.ifoa.progettoblog.models.Post;
import it.ifoa.progettoblog.repositories.PostRepository;

@Controller
@RequestMapping("/api/posts")
public class PostRestController {

    @Autowired
    private PostRepository postRepository;

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Post> getAllPost(){
        return postRepository.findAll();
    }

}
