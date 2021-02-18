package com.amsidh.mvc.service;

import com.amsidh.mvc.model.ExchangeRate;
import feign.auth.BasicAuthRequestInterceptor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange", url = "http://${CURRENCY_EXCHANGE_HOST:localhost}:8100", configuration = CurrencyExchangeFeignClientConfiguration.class)
@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_SERVICE_URI:http://localhost}:8100", configuration = CurrencyExchangeFeignClientConfiguration.class)
public interface CurrencyExchangeFeignClient {

    @GetMapping("/currency-exchange/{fromCurrency}/{toCurrency}")
    ExchangeRate getExchangeRateByFromCurrencyAndToCurrency(@PathVariable(value = "fromCurrency") String fromCurrency,
                                                            @PathVariable(value = "toCurrency") String toCurrency);
}

class CurrencyExchangeFeignClientConfiguration {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("amsidh", "Pass@123");
    }
}

