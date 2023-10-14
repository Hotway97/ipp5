package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Entity.CartItem;
import com.example.demo.Entity.Client;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    public Iterable<CartItem> findCartItemByUser(Client client);
    public void deleteAllByUser(Client client);
}

