package ru.liga.strategy.service;

public class PaymentService {

    public void receivePayment() {
        sendCourier();
        receiveCash();
        backToStore();
        System.out.println("Заказ доставлен, деньги в магазине, profit!");
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