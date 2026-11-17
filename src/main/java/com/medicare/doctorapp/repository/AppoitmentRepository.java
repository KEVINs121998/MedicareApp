package com.medicare.doctorapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.medicare.doctorapp.entity.Appointment;

public interface AppoitmentRepository extends JpaRepository<Appointment,Long>{

}
