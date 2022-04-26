package com.post.meridiem.service;

import com.post.meridiem.model.Products;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

@Service
public class ProductService {

    public List<Products> getProducts(boolean value) {
        if (value)
            return asList(
                    Products.builder().productId("100").productName("Sample Product").productPrice(100D).build(),
                    Products.builder().productId("101").productName("Trial Product").productPrice(100D).build()
            );
        return emptyList();
    }
}
