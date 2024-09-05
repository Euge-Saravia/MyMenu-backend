package mymenu.mymenu.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import mymenu.mymenu.models.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer> {
    
}
