package com.acl.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.course.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	

}
