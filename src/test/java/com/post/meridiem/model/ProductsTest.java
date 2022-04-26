package com.post.meridiem.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductsTest {

    @Test
    public void toStringTest() {
        Products products = new Products();
        products.setProductId("100");
        products.setProductName("Product");
        products.setProductPrice(100D);
        String toString = products.getProductPrice().toString();
        assertTrue(toString.contains("100"));
    }

    @Test
    public void equalsTest() {
        Products productsOne = new Products();
        productsOne.setProductId("100");
        productsOne.setProductName("Product");
        productsOne.setProductPrice(100D);
        Products productsTwo = new Products();
        productsTwo.setProductId("100");
        productsTwo.setProductName("Product");
        productsTwo.setProductPrice(100D);
        assertEquals(productsOne, productsTwo);
    }

    @Test
    public void hashCodeTest() {
        Products productsOne = new Products();
        productsOne.setProductId("100");
        productsOne.setProductName("Product");
        productsOne.setProductPrice(100D);
        Products productsTwo = new Products();
        productsTwo.setProductId("100");
        productsTwo.setProductName("Product");
        productsTwo.setProductPrice(100D);
        assertEquals(productsOne.hashCode(), productsTwo.hashCode());
    }

    @Test
    public void builderTest() {
        Products.ProductsBuilder productsBuilder = new Products.ProductsBuilder();
        productsBuilder.productId("100");
        productsBuilder.productName("Product");
        productsBuilder.productPrice(100D);
        Products products = productsBuilder.build();
        assertEquals(products.getProductPrice(), 100D);
        assertEquals(products.getProductId(), "100");
        assertEquals(products.getProductName(), "Product");
    }

    @Test
    public void getterTest() {
        Products products = new Products();
        products.setProductId("100");
        products.setProductName("Product");
        products.setProductPrice(100D);
        assertEquals(products.getProductPrice(), 100D);
        assertEquals(products.getProductId(), "100");
        assertEquals(products.getProductName(), "Product");
    }

    @Test
    public void setterTest() {
        Products products = new Products();
        products.setProductId("100");
        products.setProductName("Product");
        products.setProductPrice(100D);
        assertEquals(products.getProductPrice(), 100D);
        assertEquals(products.getProductId(), "100");
        assertEquals(products.getProductName(), "Product");
    }
}
