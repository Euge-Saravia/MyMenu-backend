package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Products;
import mymenu.mymenu.services.ProductsService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ProductsController {
    private final ProductsService productsService;

    public ProductsController(ProductsService productsService){
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public List<Products> getProducts(){
        return productsService.getProducts();
    }
    
}
