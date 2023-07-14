package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment , Integer> {
	
	
}
