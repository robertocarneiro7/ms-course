package com.robertocarneiro.hrpayroll.services;

import com.robertocarneiro.hrpayroll.entities.Payment;

import java.math.BigDecimal;

public interface PaymentService {

    Payment getPayment(Long workerId, BigDecimal days);
}
