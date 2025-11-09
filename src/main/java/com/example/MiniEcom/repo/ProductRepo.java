package com.example.MiniEcom.repo;

import com.example.MiniEcom.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    public List<Product> findAll();
    //public Product findById(int id);

}
