package com.projectJPA.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectJPA.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
}
