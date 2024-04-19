package com.acl.course.repositores;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.course.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	

}
