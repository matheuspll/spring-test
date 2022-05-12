package com.letsfkingo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsfkingo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
