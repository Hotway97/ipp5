package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {
}
