package com.example.assignmentpart1.repository;


import com.example.assignmentpart1.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {

    Market findById(int id);
}
