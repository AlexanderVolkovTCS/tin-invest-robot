package ru.abelogur.tininvestrobot.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@Accessors(chain = true)
public class BotSettings {
    private UUID uuid;
    private Instant start;
    private String accountId;
    private BotType botType;
    private String figi;
    private BigDecimal takeProfit;
    private BigDecimal stopLoss;
    private int numberOfLots = 1;
}