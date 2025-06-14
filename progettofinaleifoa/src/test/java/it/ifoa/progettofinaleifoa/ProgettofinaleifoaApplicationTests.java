package it.ifoa.progettofinaleifoa;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import it.ifoa.progettofinaleifoa.models.Product;
import it.ifoa.progettofinaleifoa.repositories.ProductRepository;

// @SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
class ProgettofinaleifoaApplicationTests {

	@Autowired
    ProductRepository productRepository;
    
    @BeforeEach
    void load(){
        Product p1 = new Product();
        p1.setName("Laptop");
        p1.setDescription("High performance laptop with 16GB RAM and 512GB SSD.");
        p1.setPrice(1200L);
        productRepository.save(p1);
        
        Product p2 = new Product();
        p2.setName("Smartphone");
        p2.setDescription("Latest model smartphone with OLED display and 5G connectivity.");
        p2.setPrice(800L);
        productRepository.save(p2);
        
        Product p3 = new Product();
        p3.setName("Wireless Headphones");
        p3.setDescription("Noise cancelling wireless headphones with 20 hours battery life.");
        p3.setPrice(150L);
        productRepository.save(p3);
    }

	// @Test
	// void contextLoads() {
	// }

	@Test
    void findByProductName() {
        assertThat(productRepository.findByName("Laptop")).extracting("name").containsOnly("Laptop");
    }

	@Test
    void findByPriceLessThan() {
        assertThat(productRepository.findByPriceLessThan(1000))
        .extracting("name")
        .containsExactlyInAnyOrder("Smartphone", "Wireless Headphones");
    }
    
    @Test
    void findByDescriptionContaining() {
        assertThat(productRepository.findByDescriptionContaining("display"))
        .extracting("name")
        .containsOnly("Smartphone");
    }
    
    @Test
    void findByExactPrice() {
        assertThat(productRepository.findByExactPrice(150))
        .extracting("name")
        .containsOnly("Wireless Headphones");
    }
    
    @Test
    void findByExactName() {
        assertThat(productRepository.findByExactName("Smartphone"))
        .extracting("name")
        .containsOnly("Smartphone");
    }
    
    //Altre
    @Test
    void findByPriceGreaterThan() {
        assertThat(productRepository.findByPriceGreaterThan(700))
        .extracting("name")
        .containsExactlyInAnyOrder("Laptop", "Smartphone");
    }
    
    @Test
    void findByNameContainingIgnoreCase() {
        assertThat(productRepository.findByNameContainingIgnoreCase("phone"))
        .extracting("name")
        .containsExactlyInAnyOrder("Smartphone", "Wireless Headphones");
    }
    
    @Test
    void findByNameAndPriceLessThan() {
        assertThat(productRepository.findByNameAndPriceLessThan("Smartphone", 900))
        .extracting("name")
        .containsOnly("Smartphone");
    }
    
    @Test
    void findProductsByExactPrice() {
        assertThat(productRepository.findProductsByExactPrice(800))
        .extracting("name")
        .containsOnly("Smartphone");
    }
    
    @Test
    void findProductsByNamePrefix() {
        assertThat(productRepository.findProductsByNamePrefix("Wire"))
        .extracting("name")
        .containsOnly("Wireless Headphones");
    }
    

}
