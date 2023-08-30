package com.hvalut.testapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hvalut.testapi.model.Transactions;

public interface TransactionRepository extends JpaRepository<Transactions, Long>{
    
}
