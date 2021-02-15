package com.amsidh.mvc.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class CurrencyConversion implements Serializable {

    private String currencyFrom;
    private String currencyTo;
    private BigDecimal quantity;
    private BigDecimal value;
    private String exchangeEnvironmentInfo;

}
