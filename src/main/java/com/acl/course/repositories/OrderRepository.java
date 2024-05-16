package com.acl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
