package com.msgcoin.crypto.entity;

import jakarta.persistence.Entity;
import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AvgPrice {
    private int mins;
    private BigDecimal price;
    private String symbol;
}
