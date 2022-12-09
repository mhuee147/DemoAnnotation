package com.example.annotation.controllers;

import com.example.annotation.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/Products")
public class ProductController {
    //this request is: http://localhost:8080/Product/getAllProducts
    @GetMapping("")
    List<Product> getAllProducts(){
        return List.of(
                new Product(1L,"Macbook",2020,2400,""),
                new Product(2L,"hp",2022,3400,"")

        );
    }

}
