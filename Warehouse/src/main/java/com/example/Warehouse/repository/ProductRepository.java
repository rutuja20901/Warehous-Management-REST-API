package com.example.Warehouse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Warehouse.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

    boolean findBySku(String sku);

    boolean existsBySku(String sku);

    List<ProductModel> findByVendor(String vendor);

}
