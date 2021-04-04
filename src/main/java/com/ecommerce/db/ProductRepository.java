package com.ecommerce.db;
import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.model.Product;


public interface ProductRepository extends JpaRepository<Product, String> {

}
