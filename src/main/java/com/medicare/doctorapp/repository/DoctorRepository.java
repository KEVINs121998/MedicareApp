package com.medicare.doctorapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.doctorapp.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Long>{

}
