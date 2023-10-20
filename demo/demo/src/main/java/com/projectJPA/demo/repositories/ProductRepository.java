package com.projectJPA.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectJPA.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
