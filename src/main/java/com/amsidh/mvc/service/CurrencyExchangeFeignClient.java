package com.amsidh.mvc.service;

import com.amsidh.mvc.model.ExchangeRate;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "currency-exchange", url = "http://${CURRENCY_EXCHANGE_HOST:localhost}:8100", configuration = CurrencyExchangeFeignClientConfiguration.class)
//@FeignClient(name = "currency-exchange", url = "${CURRENCY_EXCHANGE_SERVICE_URI:http://localhost}:8100", configuration = CurrencyExchangeFeignClientConfiguration.class)
@FeignClient(name = "currency-exchange-service") //Kubernetes Service Name
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeFeignClient {

    @GetMapping("/currency-exchange/{fromCurrency}/{toCurrency}")
    ExchangeRate getExchangeRateByFromCurrencyAndToCurrency(@PathVariable(value = "fromCurrency") String fromCurrency,
                                                            @PathVariable(value = "toCurrency") String toCurrency);
}

/*class CurrencyExchangeFeignClientConfiguration {

    @Bean
    public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
        return new BasicAuthRequestInterceptor("amsidh", "Pass@123");
    }
}*/

