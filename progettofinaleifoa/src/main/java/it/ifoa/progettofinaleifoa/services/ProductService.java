package it.ifoa.progettofinaleifoa.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import it.ifoa.progettofinaleifoa.dtos.ProductDto;
import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.repositories.ProductRepository;

public class ProductService implements CrudService<ProductDto, Product, Long>{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ModelMapper mapper;

    @Override
    public List<ProductDto> readAll() {
        return productRepository.findAll();
    }

    @Override
    public ProductDto read(Long key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public ProductDto create(Product model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'create'");
    }

    @Override
    public ProductDto update(Long key, Product model) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(Long key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

}
