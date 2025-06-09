package it.ifoa.progettofinaleifoa.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ifoa.progettofinaleifoa.dtos.ProductDto;
import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.services.CrudService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    @Qualifier("productService")
    private CrudService<ProductDto, Product, Long> productService;

    @GetMapping
    public List<ProductDto> getAllProducts(){
        return productService.readAll();
    }

    @GetMapping("{id}")
    public ProductDto getProduct(@PathVariable("id") Long id){
        return productService.read(id);
    }

    @PostMapping
    public ProductDto createProduct(@RequestBody Product product){
        return productService.create(product);
    }

    @PutMapping("{id}")
    public ProductDto updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return productService.update(id, product);
    }

    @DeleteMapping("{id}")
    public void deleteProduct(@PathVariable("id") Long id){
        productService.delete(id);
    }

}
