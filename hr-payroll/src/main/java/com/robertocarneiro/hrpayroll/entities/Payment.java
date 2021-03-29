package com.robertocarneiro.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    private String name;
    private BigDecimal dailyIncome;
    private BigDecimal days;

    public BigDecimal getTotal() {
        return days.multiply(dailyIncome);
    }
}
