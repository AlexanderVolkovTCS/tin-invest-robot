package ru.abelogur.tininvestrobot.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@AllArgsConstructor
public class Order {
    private TradeType type;
    private BigDecimal openPrice;

    public boolean isLong() {
        return type.equals(TradeType.LONG);
    }

    public boolean isShort() {
        return type.equals(TradeType.SHORT);
    }
}
