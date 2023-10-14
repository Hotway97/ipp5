package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.Good;

public interface GoodRepository extends JpaRepository<Good, Integer> {

}
