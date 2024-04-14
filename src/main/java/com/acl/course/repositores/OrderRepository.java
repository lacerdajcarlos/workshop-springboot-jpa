package com.acl.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.course.entites.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
