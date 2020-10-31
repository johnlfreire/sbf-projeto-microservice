package com.br.sfb.AccountManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.sfb.AccountManagement.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}