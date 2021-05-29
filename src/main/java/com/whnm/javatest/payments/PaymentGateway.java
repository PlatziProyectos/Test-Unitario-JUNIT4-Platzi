package com.whnm.javatest.payments;

public interface PaymentGateway {
   PaymentResponse requestPayment(PaymentRequest request);
}
