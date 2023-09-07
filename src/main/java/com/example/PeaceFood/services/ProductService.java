package com.example.PeaceFood.services;

import com.example.PeaceFood.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product( ID++, "Milk", "Natural cow milk. 1l", 30));
        products.add(new Product( ID++, "Carrot", "Sunset orange. Price for 1kg", 8.5));
        products.add(new Product( ID++,"Soy cutlets", "Cutlets from soy. 500g", 25.8));
    }

    public List<Product> getAll(){
        return products;
    }

    public void saveProduct(Product p){
        p.setId(ID++);
        products.add(p);
    }

    public void addProduct(Product p){
        p.setId(ID++);
        products.add(p);
    }

    public void deleteProduct(long id){
        products.removeIf(product -> product.getId() == id);
    }




}
