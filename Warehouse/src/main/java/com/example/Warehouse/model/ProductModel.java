package com.example.Warehouse.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class ProductModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String description;

    private String vendor;

    private int price;

    private int stock;

    private String currency;

    private String image_url;

    private String sku;

    public ProductModel() {

    }

    public ProductModel(int id, String name, String description, String vendor, int price, int stock, String currency,
            String image_url, String sku) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.vendor = vendor;
        this.price = price;
        this.stock = stock;
        this.currency = currency;
        this.image_url = image_url;
        this.sku = sku;
    }

    public ProductModel(String name, String description, String vendor, int price, int stock, String currency,
            String image_url, String sku) {
        this.name = name;
        this.description = description;
        this.vendor = vendor;
        this.price = price;
        this.stock = stock;
        this.currency = currency;
        this.image_url = image_url;
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "ProductModel [id=" + id + ", name=" + name + ", description=" + description + ", vendor=" + vendor
                + ", price=" + price + ", stock=" + stock + ", currency=" + currency + ", image_url=" + image_url
                + ", sku=" + sku + "]";
    }

}
