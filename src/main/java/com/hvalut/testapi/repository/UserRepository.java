package com.hvalut.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hvalut.testapi.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
