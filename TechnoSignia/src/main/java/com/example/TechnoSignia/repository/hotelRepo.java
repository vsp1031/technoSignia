package com.example.TechnoSignia.repository;

import com.example.TechnoSignia.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface hotelRepo extends JpaRepository<Hotel,Long> {

}
