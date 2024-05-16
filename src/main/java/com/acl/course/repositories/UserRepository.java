package com.acl.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acl.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	

}
