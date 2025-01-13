package ru.liga.strategy.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum PaymentMethod {

    CASH("наличными");

    private final String description;
}