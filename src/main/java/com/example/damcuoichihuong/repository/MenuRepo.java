package com.example.damcuoichihuong.repository;

import com.example.damcuoichihuong.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Menu, Integer> {
    @Query(value = "select sum(price) from menus", nativeQuery = true)
    Integer totalPrice();
}
