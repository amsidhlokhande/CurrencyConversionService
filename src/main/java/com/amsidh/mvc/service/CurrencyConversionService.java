package com.amsidh.mvc.service;

import com.amsidh.mvc.model.CurrencyConversion;

public interface CurrencyConversionService {
    CurrencyConversion getCureCurrencyConversion(String fromCurrency, String toCurrency, Integer quantity);
}
