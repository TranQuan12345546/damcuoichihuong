package com.example.damcuoichihuong.repository;

import com.example.damcuoichihuong.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepo extends JpaRepository<Guest, Integer> {
}
