package com.example.Warehouse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Warehouse.model.ProductModel;
import com.example.Warehouse.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepo;

    // PostMapping
    public Object post(@RequestBody ProductModel product) {
        if (productRepo.existsBySku(product.getSku())) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } else {
            ProductModel p = new ProductModel(product.getName(), product.getDescription(), product.getVendor(),
                    product.getPrice(), product.getStock(), product.getCurrency(), product.getImage_url(),
                    product.getSku());
            productRepo.save(p);
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
    }

    // update products
    public Object put(@RequestBody ProductModel product, @PathVariable int id) {
        Optional<ProductModel> p = productRepo.findById(id);
        if (p.isPresent()) {
            ProductModel m = p.get();
            m.setPrice(product.getPrice());
            m.setStock(product.getStock());
            ProductModel u = productRepo.save(m);
            return ResponseEntity.status(HttpStatus.OK).body(u);
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    // list of products
    public Object get() {
        List<ProductModel> l = productRepo.findAll();
        if (l.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(l);
        }

    }

    // Get product using value
    public Object getValue(@RequestParam String value) {
        List<ProductModel> l = productRepo.findByVendor(value);
        if (l.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(l);
        }
    }

    // delete product by id
    public Object delete(@PathVariable int id) {
        Optional<ProductModel> l = productRepo.findById(id);
        if (l.isEmpty()) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        } else {
            productRepo.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).build();
        }
    }

}
