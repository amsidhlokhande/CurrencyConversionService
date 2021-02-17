package com.amsidh.mvc.controller;

import com.amsidh.mvc.model.CurrencyConversion;
import com.amsidh.mvc.service.CurrencyConversionService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
public class CurrencyConversionController {

    private final CurrencyConversionService currencyConversionService;

    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "Currency Exchange Rate Service is up and running";
    }


    @GetMapping("/currency-conversion/from/{fromCurrency}/to/{toCurrency}/value/{quantity}")
    public CurrencyConversion getCurrencyConversionValue(@PathVariable(value = "fromCurrency", required = true) String fromCurrency, @PathVariable(value = "toCurrency", required = true) String toCurrency, @PathVariable(value = "quantity", required = true) Integer quantity) {
        log.info("fromCurrency {} TO toCurrency{} quantity{}", fromCurrency, toCurrency, quantity);
        return currencyConversionService.getCureCurrencyConversion(fromCurrency, toCurrency, quantity);
    }
}
