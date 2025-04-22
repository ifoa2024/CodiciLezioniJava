package it.ifoa.progettoblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ifoa.progettoblog.models.Author;
import it.ifoa.progettoblog.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping
    public String getAuthors(Model viewModel) {
        viewModel.addAttribute("title", "Tutti gli autori");
        viewModel.addAttribute("authors", authorService.readAll());
        return "authors";
    }

    @GetMapping("/create")
    public String createAuthorView(Model viewModel) {
        viewModel.addAttribute("title", "Crea Autore");
        viewModel.addAttribute("author", new Author());
        return "createAuthor";
    }

    @PostMapping
    public String createAuthor(@ModelAttribute("author") Author author) {
        authorService.create(author);
        return "redirect:/authors";
    }

    @GetMapping("edit/{id}")
    public String modifyAuthor(@PathVariable("id") Long id, Model viewModel) {
        viewModel.addAttribute("title", "Update Author");
        viewModel.addAttribute("author", authorService.read(id));
        return "updateAuthor";
    }

    @PostMapping("update")
    public String modifyAuthor(@ModelAttribute("author") Author author) {
        authorService.update(author.getId(), author);
        return "redirect:/authors";
    }

    @GetMapping("remove/{id}")
    public String removeAuthor(@PathVariable("id") Long id) {
        authorService.delete(id);
        return "redirect:/authors";
    }
}
