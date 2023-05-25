package com.example.damcuoichihuong.repository;

import com.example.damcuoichihuong.entity.Gift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftRepo extends JpaRepository<Gift, Integer> {
    @Query(value = "select sum(price) from gifts", nativeQuery = true)
    Integer totalPrice();
}
