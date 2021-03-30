package com.robertocarneiro.hrpayroll.resources;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.robertocarneiro.hrpayroll.entities.Payment;
import com.robertocarneiro.hrpayroll.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentResource {

    private final PaymentService service;

    @HystrixCommand(fallbackMethod = "getPaymentAlternative")
    @GetMapping("/{workerId}/days/{days}")
    public Payment getPayment(@PathVariable Long workerId,
                              @PathVariable Integer days) {
        return service.getPayment(workerId, BigDecimal.valueOf(days));
    }

    public Payment getPaymentAlternative(Long workerId, Integer days) {
        return Payment
                .builder()
                .name("Brann")
                .dailyIncome(BigDecimal.valueOf(400.0))
                .days(BigDecimal.valueOf(days))
                .build();
    }
}
