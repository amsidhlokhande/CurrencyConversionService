package com.amsidh.mvc.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class ExchangeRate implements Serializable {
    private Integer id;
    private String currencyFrom;
    private String currencyTo;
    private BigDecimal conversionMultiple;
    private String exchangeEnvironmentInfo;
}
