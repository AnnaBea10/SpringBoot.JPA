package com.projectJPA.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projectJPA.demo.entities.OrderItem;
import com.projectJPA.demo.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
}
