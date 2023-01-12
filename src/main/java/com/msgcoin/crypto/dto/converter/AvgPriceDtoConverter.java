package com.msgcoin.crypto.dto.converter;

import com.msgcoin.crypto.dto.AvgPriceDto;
import com.msgcoin.crypto.entity.AvgPrice;
import org.springframework.stereotype.Component;

@Component
public class AvgPriceDtoConverter {
    public AvgPriceDto convert(AvgPrice from){
        return new AvgPriceDto(from.getMins(), from.getPrice(), from.getSymbol());
    }
}
