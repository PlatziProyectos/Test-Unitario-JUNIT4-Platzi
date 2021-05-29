package com.whnm.javatest.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {
    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setUp() throws Exception {
        paymentGateway =
                Mockito.mock(PaymentGateway.class);
        paymentProcessor =
                new PaymentProcessor(paymentGateway);
    }

    @Test
    public void paymentIsCorrect() {
        /*
         * Parte 1: Preparacion de los datos
         */
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));


        /*
         * Parte 2: Ejecucion del metodo objetivo
         */
        boolean result = paymentProcessor.makePayment(1000);

        /*
         * Parte 3: Comprobacion del resultado
         */
        assertTrue(result);
    }

    @Test
    public void paymentIsNoCorrect() {
        Mockito.when(paymentGateway.requestPayment(Mockito.any()))
                .thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        assertFalse(paymentProcessor.makePayment(1000));
    }
}