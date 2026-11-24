package com.medicare.doctorapp.repository;

import java.util.Optional; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.doctorapp.entity.User;


public interface UserRepository extends JpaRepository<User,Long>{
Optional<User> findByEmail(String email);
}
