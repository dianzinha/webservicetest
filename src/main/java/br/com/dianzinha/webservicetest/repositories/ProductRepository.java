package br.com.dianzinha.webservicetest.repositories;


import br.com.dianzinha.webservicetest.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {

    // Custom query methods can be defined here if needed
    // For example:
    // List<Product> findByName(String name);
}
