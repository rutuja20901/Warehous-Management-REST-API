package com.example.Warehouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Warehouse.model.ProductModel;
import com.example.Warehouse.service.ProductService;

@RestController
@RequestMapping("/warehouse")
public class ProductController {

    @PostMapping("/chaeck")
    public String check() {
        return "working";
    }

    @Autowired
    private ProductService productService;

    @PostMapping("/post")
    private Object post(@RequestBody ProductModel product) {
        return productService.post(product);
    }

    @GetMapping("/get")
    private Object get() {
        return productService.get();
    }

    @PutMapping("/put/{id}")
    private Object put(@RequestBody ProductModel product, @PathVariable int id) {
        return productService.put(product, id);
    }

    @GetMapping("/value")
    private Object getValue(@RequestParam String value) {
        return productService.getValue(value);
    }

    @DeleteMapping("/delete/{id}")
    private Object delete(@PathVariable int id) {
        return productService.delete(id);
    }

}
