package ru.liga.strategy.service.impl;

import ru.liga.strategy.model.Order;
import ru.liga.strategy.model.PaymentMethod;
import ru.liga.strategy.service.PaymentStrategy;

public class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(Order order) {
        System.out.println("Обработка оплаты картой...");
        validateCardDetails();
        processTransaction();
        System.out.println("Оплата картой успешно завершена.");
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CARD;
    }

    private void validateCardDetails() {
        System.out.println("Проверка карты...");
    }

    private void processTransaction() {
        System.out.println("Обработка транзакции...");
    }
}