package com.robertocarneiro.hrpayroll.services.impl;

import com.robertocarneiro.hrpayroll.entities.Payment;
import com.robertocarneiro.hrpayroll.services.PaymentService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Override
    public Payment getPayment(Long workerId, BigDecimal days) {
        return Payment
                .builder()
                .name("Bob")
                .dailyIncome(new BigDecimal("200.0"))
                .days(days)
                .build();
    }
}
