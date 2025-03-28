package com.Abhishek.Ecommerce.Repo;

import com.Abhishek.Ecommerce.Entity_Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
