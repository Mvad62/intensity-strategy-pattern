package ru.liga.strategy.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PaymentMethod {

    CASH("наличными"),
    CARD("картой"),
    BANK("безналичный перевод");

    private final String description;
}