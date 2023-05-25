package com.example.damcuoichihuong.service;

import com.example.damcuoichihuong.entity.Product;
import com.example.damcuoichihuong.repository.ProductRepo;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService{
    private ProductRepo productRepo;

    public ProductServiceImp(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @Override
    public Product insertProduct(Product product) {
        return productRepo.save(product);
    }
}
