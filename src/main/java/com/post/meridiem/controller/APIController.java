package com.post.meridiem.controller;

import com.post.meridiem.model.Products;
import com.post.meridiem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Products> getProducts(@PathVariable boolean value){
        return productService.getProducts(value);
    }
}
