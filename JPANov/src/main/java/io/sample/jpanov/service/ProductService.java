package io.sample.jpanov.service;

import io.sample.jpanov.entity.Product;
import io.sample.jpanov.repository.ProductRepo;
//import org.hibernate.mapping.List;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepo repo;
    public ProductService(ProductRepo repo) {
        this.repo = repo;
    }

    public void saveProduct() {
        Product product = new Product(10L, "Chair", 120.0, "1234");
        repo.save(product);
    }

    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    public Optional<Product> findProdByID(Long id) {
        return repo.findById(id);
    }



}
