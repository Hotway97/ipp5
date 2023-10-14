package com.example.demo.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItemDTO {
    public int clientId;
    public int goodId;
    public int countOfGood;
}
