package com.projectJPA.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectJPA.demo.entities.Product;
import com.projectJPA.demo.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository category;
	
	public List<Product> findAll(){
		return category.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = category.findById(id);
		return obj.get();
	}
}
