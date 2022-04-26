package com.post.meridiem.stub;

import com.post.meridiem.model.Products;

import java.util.List;

import static java.util.Arrays.asList;

public class ProductStub {
    public static List<Products> getProductStub() {
        return asList(
                Products.builder().productId("100").productName("Sample Product").productPrice(100D).build(),
                Products.builder().productId("101").productName("Trial Product").productPrice(100D).build()
        );
    }
}
