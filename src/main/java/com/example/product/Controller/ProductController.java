package com.example.product.Controller;


import com.example.product.Model.Product;
import com.example.product.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping("/products")
    public List<Product> listAll(){
        return service.listAll();
    }

    //To Add new product in the database
    @PostMapping("/add/product")
    public Product add(@RequestBody Product product){
        return service.save(product);
    }


}
