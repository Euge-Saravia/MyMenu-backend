package mymenu.mymenu.services;

import java.util.List;

import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Products;
import mymenu.mymenu.repositories.ProductsRepository;

@Service
public class ProductsService {
    
    private final ProductsRepository productsRepository;

    public ProductsService(ProductsRepository productsRepository){
        this.productsRepository = productsRepository;
    }

    public List<Products> getProducts(){
        return productsRepository.findAll();
    }
}
