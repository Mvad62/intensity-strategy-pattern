package ru.liga.strategy.service.impl;

import ru.liga.strategy.model.Order;
import ru.liga.strategy.model.PaymentMethod;
import ru.liga.strategy.service.PaymentStrategy;

public class BankTransferPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(Order order) {
        System.out.println("Обработка безналичного расчета...");
        generateInvoice();
        waitForPayment();
        confirmPayment();
        System.out.println("Безналичный расчет успешно завершен.");
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.BANK;
    }

    private void generateInvoice() {
        System.out.println("Генерация счета на оплату...");
    }

    private void waitForPayment() {
        System.out.println("Ожидание поступления средств...");
    }

    private void confirmPayment() {
        System.out.println("Подтверждение получения платежа...");
    }
}