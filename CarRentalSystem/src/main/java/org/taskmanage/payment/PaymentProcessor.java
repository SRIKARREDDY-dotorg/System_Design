package org.taskmanage.payment;

public interface PaymentProcessor {
    boolean processPayment(double amount);
}