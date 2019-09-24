package com.example.assignmentpart1.repository;


import com.example.assignmentpart1.entity.Coin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoinRepository extends JpaRepository<Coin, Integer> {

    List<Coin> findAllByMarketId(int id);

    List<Coin> findAllByNameLike(String keyword);
//    @Query("SELECT c.name FROM coin c WHERE c.name LIKE CONCAT('%',:keyword,'%')")
//    List<Coin> findByNameLike(@Param("name") String keyword);
}
