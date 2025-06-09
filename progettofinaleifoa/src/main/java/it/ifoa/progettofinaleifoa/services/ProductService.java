package it.ifoa.progettofinaleifoa.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import it.ifoa.progettofinaleifoa.dtos.ProductDto;
import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.repositories.ProductRepository;

@Service
public class ProductService implements CrudService<ProductDto, Product, Long>{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ProductDto> readAll() {
        List<ProductDto> dtos = new ArrayList<ProductDto>();
        for (Product product : productRepository.findAll()) {
            dtos.add(mapper.map(product, ProductDto.class));
        }
        return dtos;
    }

    @Override
    public ProductDto read(Long key) {
        Optional<Product> optProduct = productRepository.findById(key);
        if(optProduct.isPresent()){
            return mapper.map(optProduct.get(),ProductDto.class);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Product id=" + key + " not found");
        }
    }

    @Override
    public ProductDto create(Product model) {
        return mapper.map(productRepository.save(model),ProductDto.class);
    }

    @Override
    public ProductDto update(Long key, Product model) {
         if (productRepository.existsById(key)) {
                model.setId(key);
                return mapper.map(productRepository.save(model), ProductDto.class) ;
            } else {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
            }
    }

    @Override
    public void delete(Long key) {
        productRepository.deleteById(key);
    }

}
