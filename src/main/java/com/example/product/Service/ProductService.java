package com.example.product.Service;

import com.example.product.Model.Product;
import com.example.product.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<Product> listAll(){
        return repo.findAll();
    }

    public Product save(Product product){
        System.out.println("Product Added Successfully");
        return repo.save(product);
    }






}
