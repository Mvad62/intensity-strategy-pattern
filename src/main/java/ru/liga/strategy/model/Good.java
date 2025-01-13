package ru.liga.strategy.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Good {

    private String name;
    private int quantity;
    private BigDecimal cost;
}