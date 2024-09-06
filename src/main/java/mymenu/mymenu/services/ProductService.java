package mymenu.mymenu.services;

import java.util.List;

import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import mymenu.mymenu.models.Product;
import mymenu.mymenu.repositories.ProductRepository;

@Service
public class ProductService {

    private final ProductRepository productsRepository;

    public ProductService(ProductRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    public List<Product> getProducts() {
        return productsRepository.findAll();
    }

    public ResponseEntity<Object> addProduct(Product products) {
        productsRepository.save(products);
        return new ResponseEntity<>(products, HttpStatus.CREATED);
    }

    public ResponseEntity<Object> updateProduct(int id, Product updatedProduct) {
        Optional<Product> productOptional = productsRepository.findById(id);
        if (productOptional.isPresent()) {
            Product existingProduct = productOptional.get();
            existingProduct.setProduct(updatedProduct.getProduct());
            productsRepository.save(existingProduct);
            return new ResponseEntity<>(existingProduct, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Producto no encontrado", HttpStatus.NOT_FOUND);
        }
    }

    public ResponseEntity<Object> deleteProduct(int id){
        Optional<Product> optionalProduct = productsRepository.findById(id);
        if (optionalProduct.isPresent()) {
            productsRepository.delete(optionalProduct.get());
            return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }

}
