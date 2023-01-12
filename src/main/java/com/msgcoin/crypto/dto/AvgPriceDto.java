package com.msgcoin.crypto.dto;

import lombok.*;

import java.math.BigDecimal;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AvgPriceDto {
    private int mins;
    private BigDecimal price;
    private String symbol;
}
