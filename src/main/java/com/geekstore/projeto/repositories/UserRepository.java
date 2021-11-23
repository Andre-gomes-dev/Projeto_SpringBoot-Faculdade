package com.geekstore.projeto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geekstore.projeto.domain.model.User;

public interface UserRepository extends JpaRepository<User ,Long>{

	
	
}
