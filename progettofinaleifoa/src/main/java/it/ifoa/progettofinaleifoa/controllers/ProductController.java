package it.ifoa.progettofinaleifoa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.ifoa.progettofinaleifoa.dtos.ProductDto;
import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.services.CrudService;

@Controller
@RequestMapping("/products")
public class ProductController {

    @Autowired
    @Qualifier("productService")
    private CrudService<ProductDto, Product, Long> productService;

    @GetMapping
    public String indexProduct(Model viewModel){
        // viewModel.addAttribute("la chiave che il template utilizzera", "il valore del dato che verrà riferito in base alla chiave");
        viewModel.addAttribute("title", "Tutti i prodotti");
        viewModel.addAttribute("products", productService.readAll());
        return "products";
    } 

}
