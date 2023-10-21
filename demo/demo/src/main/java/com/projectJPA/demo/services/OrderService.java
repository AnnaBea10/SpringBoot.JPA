package com.projectJPA.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectJPA.demo.entities.Order;
import com.projectJPA.demo.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//Buscar todos os pedidos
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	//Buscar pedidos por ID
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}

}
