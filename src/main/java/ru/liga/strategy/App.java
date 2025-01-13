package ru.liga.strategy;

import ru.liga.strategy.model.Good;
import ru.liga.strategy.model.Order;
import ru.liga.strategy.model.PaymentMethod;
import ru.liga.strategy.service.PaymentService;

import java.io.PrintStream;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class App {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.setErr(new PrintStream(System.err, true, StandardCharsets.UTF_8));

        Order order = Order.builder()
                .contactFio("Иванов Иван")
                .contactPhone("+79151234567")
                .paymentMethod(PaymentMethod.CASH)
                .goods(List.of(
                        Good.builder()
                                .name("Смартфон Apple iPhone")
                                .cost(BigDecimal.valueOf(50000))
                                .quantity(1)
                                .build(),
                        Good.builder()
                                .name("Наушники Apple AirPods")
                                .cost(BigDecimal.valueOf(15000))
                                .quantity(1)
                                .build()))
                .build();

        System.out.println("Клиент " + order.getContactFio() + " при оформлении заказа выбрал способ оплаты '" + order.getPaymentMethod().getDescription() + "'");

        new PaymentService().receivePayment(order);
    }
}