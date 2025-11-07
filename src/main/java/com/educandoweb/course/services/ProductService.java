package com.educandoweb.course.services;


import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Component
//@Repository
@Service
public class ProductService {
    @Autowired
    private ProductRepository productService;

    public List<Product> findAll(){
        return productService.findAll();
    }

    public Product findById(Integer id){
        Optional<Product> obj  = productService.findById(id);
        return obj.get();
    }
}
