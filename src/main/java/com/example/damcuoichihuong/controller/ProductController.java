package com.example.damcuoichihuong.controller;

import com.example.damcuoichihuong.entity.Product;
import com.example.damcuoichihuong.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ProductController {
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/product")
    public ResponseEntity<?> insertGuest(@RequestBody Product product) {
        Product product1 = productService.insertProduct(product);
        return ResponseEntity.ok(product1);
    }
}
