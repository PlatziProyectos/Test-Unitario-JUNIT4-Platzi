package com.whnm.javatest.payments;

public class PaymentProcessor {

    private PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public boolean makePayment(double amount){
        PaymentRequest paymentRequest = new PaymentRequest(amount);

        PaymentResponse paymentResponse =
                paymentGateway.requestPayment(paymentRequest);

        if(paymentResponse.getStatus().equals(PaymentResponse.PaymentStatus.OK)){
            return true;
        } else {
            return false;
        }

    }
}
