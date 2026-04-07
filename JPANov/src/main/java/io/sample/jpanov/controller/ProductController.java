package io.sample.jpanov.controller;


import io.sample.jpanov.entity.Product;
import io.sample.jpanov.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/allproducts")
    public List<Product> findAll(){
        return service.getAllProducts();
    }

    @GetMapping("/getById/{id}")
    public Optional<Product> findById(@PathVariable Long id){
        return service.findProdByID(id);
    }

    @PostMapping("/saveProduct")
    public void saveProduct(Product product){
        service.saveProduct();
    }
}
