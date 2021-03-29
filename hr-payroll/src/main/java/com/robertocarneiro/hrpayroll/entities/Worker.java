package com.robertocarneiro.hrpayroll.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Worker {

    private Long id;
    private String name;
    private BigDecimal dailyIncome;
}
