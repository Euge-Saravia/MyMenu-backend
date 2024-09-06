package mymenu.mymenu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
