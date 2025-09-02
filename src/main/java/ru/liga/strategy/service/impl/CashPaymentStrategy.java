package ru.liga.strategy.service.impl;

import ru.liga.strategy.model.Order;
import ru.liga.strategy.model.PaymentMethod;
import ru.liga.strategy.service.PaymentStrategy;

public class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void processPayment(Order order) {
        sendCourier();
        receiveCash();
        backToStore();
        System.out.println("Заказ доставлен, деньги в магазине.");
    }

    @Override
    public PaymentMethod getPaymentMethod() {
        return PaymentMethod.CASH;
    }

    private void sendCourier() {
        System.out.println("Отправляем курьера");
    }

    private void receiveCash() {
        System.out.println("Курьер получает деньги у клиента");
    }

    private void backToStore() {
        System.out.println("Курьер возвращается в магазин с деньгами");
    }
}