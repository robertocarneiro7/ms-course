package com.robertocarneiro.hrpayroll.services.impl;

import com.robertocarneiro.hrpayroll.entities.Payment;
import com.robertocarneiro.hrpayroll.entities.Worker;
import com.robertocarneiro.hrpayroll.feignclients.WorkerFeignClient;
import com.robertocarneiro.hrpayroll.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final WorkerFeignClient workerFeignClient;

    @Override
    public Payment getPayment(Long workerId, BigDecimal days) {
        Worker worker = workerFeignClient.findById(workerId);
        return Payment
                .builder()
                .name(worker.getName())
                .dailyIncome(worker.getDailyIncome())
                .days(days)
                .build();
    }
}
