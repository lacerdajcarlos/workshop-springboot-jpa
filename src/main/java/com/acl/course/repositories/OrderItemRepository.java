package com.acl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.course.entities.OrderItem;
import com.acl.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk> {

	
}
