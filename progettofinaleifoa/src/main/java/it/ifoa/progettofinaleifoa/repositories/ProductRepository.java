package it.ifoa.progettofinaleifoa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.query.Param;

import it.ifoa.progettofinaleifoa.models.Product;

public interface ProductRepository extends ListCrudRepository<Product, Long>{
    //Derived query
    List<Product> findByName(String name);
    List<Product> findByPriceLessThan(int price);
    List<Product> findByDescriptionContaining(String keyword);

    //Query native
    @Query(value = "SELECT * FROM products WHERE price = :price", nativeQuery = true)
    List<Product> findByExactPrice(@Param("price") int price);
    @Query(value = "SELECT * FROM products WHERE name = :name", nativeQuery = true)
    List<Product> findByExactName(@Param("name") String name);


    List<Product> findByPriceGreaterThan(int price);
    List<Product> findByNameContainingIgnoreCase(String namePart);
    List<Product> findByNameAndPriceLessThan(String name, int maxPrice);
    
    @Query(value = "SELECT * FROM products WHERE price = :price", nativeQuery = true)
    List<Product> findProductsByExactPrice(@Param("price") int price);
    
    @Query(value = "SELECT * FROM products WHERE name LIKE :prefix%", nativeQuery = true)
    List<Product> findProductsByNamePrefix(@Param("prefix") String prefix);
}