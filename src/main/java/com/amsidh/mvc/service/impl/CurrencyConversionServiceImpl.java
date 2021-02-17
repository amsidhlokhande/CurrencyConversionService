package com.amsidh.mvc.service.impl;

import com.amsidh.mvc.model.CurrencyConversion;
import com.amsidh.mvc.model.ExchangeRate;
import com.amsidh.mvc.service.CurrencyConversionService;
import com.amsidh.mvc.service.CurrencyExchangeFeignClient;
import com.amsidh.mvc.service.InstanceInformationService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@Slf4j
@AllArgsConstructor
public class CurrencyConversionServiceImpl implements CurrencyConversionService {
    private final CurrencyExchangeFeignClient currencyExchangeFeignClient;
    private final InstanceInformationService instanceInformationService;

    @Override
    public CurrencyConversion getCureCurrencyConversion(String fromCurrency, String toCurrency, Integer quantity) {
        log.info("Calling Currency Exchange Service");
        ExchangeRate exchangeRate = this.currencyExchangeFeignClient.getExchangeRateByFromCurrencyAndToCurrency(fromCurrency, toCurrency);
        CurrencyConversion currencyConversion = new CurrencyConversion();
        currencyConversion.setCurrencyFrom(exchangeRate.getCurrencyFrom());
        currencyConversion.setCurrencyTo(exchangeRate.getCurrencyTo());
        currencyConversion.setQuantity(new BigDecimal(quantity));
        currencyConversion.setValue(new BigDecimal(quantity).multiply(exchangeRate.getConversionMultiple()));
        currencyConversion.setExchangeEnvironmentInfo(instanceInformationService.retrieveInstanceInfo());
        return currencyConversion;
    }
}
