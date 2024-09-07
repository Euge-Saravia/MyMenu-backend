package mymenu.mymenu.controller;

import org.springframework.web.bind.annotation.RestController;

import mymenu.mymenu.models.Product;
import mymenu.mymenu.services.ProductService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class ProductController {
    private final ProductService productsService;

    public ProductController(ProductService productsService){
        this.productsService = productsService;
    }

    @GetMapping("/products")
    public List<Product> getProducts(){
        return productsService.getProducts();
    }

    @PostMapping("/products")
    public ResponseEntity<Object> addProduct(@RequestBody Product product){
        return productsService.addProduct(product);
    }
     @PutMapping("/products/{id}")
    public ResponseEntity<Object> updateProduct(@PathVariable int id, @RequestBody Product product) {
        return productsService.updateProduct(id, product);
    }

    @DeleteMapping("/products/{id}")
    public ResponseEntity<Object> deleteProduct(@PathVariable int id) {
        return productsService.deleteProduct(id);
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<Void> deleteAllProducts(){
        productsService.deleteAllProducts();
        return ResponseEntity.noContent().build();
    }
    
}
