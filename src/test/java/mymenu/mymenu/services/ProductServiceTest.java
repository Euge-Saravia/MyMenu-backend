package mymenu.mymenu.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import mymenu.mymenu.models.Product;
import mymenu.mymenu.repositories.ProductRepository;

@ExtendWith(MockitoExtension.class)
class ProductServiceTest {

    @InjectMocks
    private ProductService productService;

    @Mock
    private ProductRepository productRepository;

    @Test
    void testGetProducts() {
        // Crear un objeto Product
        Product product = new Product();
        product.setId(1);
        product.setProduct("Test Product");

        // Mockear la respuesta del repositorio
        when(productRepository.findAll()).thenReturn(Arrays.asList(product));

        // Ejecutar el método que se está probando
        List<Product> products = productService.getProducts();

        // Verificar los resultados
        assertEquals(1, products.size()); // Verifica que hay un producto en la lista
        assertEquals("Test Product", products.get(0).getProduct()); // Verifica el nombre del producto
    }
}
