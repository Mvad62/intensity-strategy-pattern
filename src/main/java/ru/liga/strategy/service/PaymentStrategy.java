package ru.liga.strategy.service;

import ru.liga.strategy.model.Order;
import ru.liga.strategy.model.PaymentMethod;

public interface PaymentStrategy {
    void processPayment(Order order);
    PaymentMethod getPaymentMethod();
}