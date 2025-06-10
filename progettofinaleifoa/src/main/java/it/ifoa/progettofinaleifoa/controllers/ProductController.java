package it.ifoa.progettofinaleifoa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ifoa.progettofinaleifoa.dtos.CategoryDto;
import it.ifoa.progettofinaleifoa.dtos.ProductDto;
import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.repositories.CategoryRepository;
import it.ifoa.progettofinaleifoa.services.CrudService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private CrudService<ProductDto, Product, Long> productService;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public String indexProduct(Model viewModel){
        // viewModel.addAttribute("la chiave che il template utilizzera", "il valore del dato che verrà riferito in base alla chiave");
        viewModel.addAttribute("title", "Tutti i prodotti");
        viewModel.addAttribute("products", productService.readAll());
        return "products";
    }

    @GetMapping("create")
    public String create(Model viewModel){
        viewModel.addAttribute("title", "Aggiungi un nuovo prodotto");
        viewModel.addAttribute("product", new Product());
        viewModel.addAttribute("categories", categoryRepository.findAll());
        return "createProduct";
    }

    @PostMapping
    public String store(@ModelAttribute("product") Product product){
        productService.create(product);
        return "redirect:/products";
    }

    @GetMapping("edit/{id}")
    public String edit(@PathVariable("id") Long id, Model viewModel){
        viewModel.addAttribute("title", "Modifica un nuovo prodotto");
        viewModel.addAttribute("product", productService.read(id));
        viewModel.addAttribute("categories", categoryRepository.findAll());
        return "editProduct";
    }

    @PostMapping("update")
    public String update(@ModelAttribute("product") Product product){
        productService.update(product.getId(), product);
        return "redirect:/products";
    }

    @GetMapping("delete/{id}")
    public String delete(@PathVariable("id") Long id){
        productService.delete(id);
        return "redirect:/products";
    }
}
