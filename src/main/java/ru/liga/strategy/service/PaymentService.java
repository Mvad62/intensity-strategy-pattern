package ru.liga.strategy.service;

import ru.liga.strategy.model.Order;
import ru.liga.strategy.model.PaymentMethod;
import ru.liga.strategy.service.impl.BankTransferPaymentStrategy;
import ru.liga.strategy.service.impl.CardPaymentStrategy;
import ru.liga.strategy.service.impl.CashPaymentStrategy;

import java.util.EnumMap;
import java.util.Map;

public class PaymentService {

    private final Map<PaymentMethod, PaymentStrategy> strategies;

    public PaymentService() {
        strategies = new EnumMap<>(PaymentMethod.class);
        strategies.put(PaymentMethod.CASH, new CashPaymentStrategy());
        strategies.put(PaymentMethod.CARD, new CardPaymentStrategy());
        strategies.put(PaymentMethod.BANK, new BankTransferPaymentStrategy());
    }

    public void receivePayment(Order order) {
        PaymentMethod paymentMethod = order.getPaymentMethod();
        PaymentStrategy strategy = strategies.get(paymentMethod);

        if (strategy == null) {
            throw new IllegalArgumentException("Неизвестный способ оплаты: " + paymentMethod);
        }

        System.out.println("Обрабатываем оплату: " + paymentMethod.getDescription());
        strategy.processPayment(order);
    }

    public void addPaymentStrategy(PaymentMethod method, PaymentStrategy strategy) {
        strategies.put(method, strategy);
    }
}