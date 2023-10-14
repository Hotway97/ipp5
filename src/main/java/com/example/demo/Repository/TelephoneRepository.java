package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Telephone;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Integer> {
}
