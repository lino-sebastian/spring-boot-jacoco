package com.post.meridiem.service;

import com.post.meridiem.model.Products;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.post.meridiem.stub.ProductStub.getProductStub;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductServiceTest {

    private ProductService productService;

    @BeforeEach
    public void setUp() {
        productService = new ProductService();
    }

    @Test
    public void should_return_list_of_products_when_value_true() {
        List<Products> products = productService.getProducts(true);
        assertEquals(products, getProductStub());
    }

    @Test
    public void should_return_empty_list_of_products_when_value_false() {
        List<Products> products = productService.getProducts(false);
        assertEquals(products, emptyList());
    }


}
