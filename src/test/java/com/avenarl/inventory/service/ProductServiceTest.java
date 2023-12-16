package com.avenarl.inventory.service;

import com.avenarl.inventory.model.Product;

import com.avenarl.inventory.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @Test

    public void addProduct() {
        Product product = new Product();
        product.setId(2L);
        product.setName("Test Product");
    }

    public void testDeleteProduct(){
        Long productId = 1L;
        productRepository.deleteById(productId);
        verify(productRepository, times(1)).deleteById(productId);

    }
}
