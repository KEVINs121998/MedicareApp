package com.medicare.doctorapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.doctorapp.entity.User;


public interface UserRepoitory extends JpaRepository<User,Long>{

}
