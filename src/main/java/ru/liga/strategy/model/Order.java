package ru.liga.strategy.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Order {

    private List<Good> goods;
    private String contactFio;
    private String contactPhone;
    private PaymentMethod paymentMethod;
}