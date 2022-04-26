package com.post.meridiem.controller;

import com.post.meridiem.model.Products;
import com.post.meridiem.service.ProductService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static com.post.meridiem.stub.ProductStub.getProductStub;
import static java.util.Collections.emptyList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class APIControllerTest {
    @InjectMocks
    private APIController apiController;

    @Mock
    private ProductService productService;

    @AfterEach
    public void tearDown() {
        Mockito.reset(productService);
    }

    @Test
    public void should_return_product_list_when_path_variable_true() {
        when(productService.getProducts(true)).thenReturn(getProductStub());
        List<Products> products = apiController.getProducts(true);
        assertNotEquals(products.size(), 0);
    }

    @Test
    public void should_return_empty_product_list_when_path_variable_false() {
        when(productService.getProducts(false)).thenReturn(emptyList());
        List<Products> products = apiController.getProducts(false);
        assertEquals(products.size(), 0);
    }
}
